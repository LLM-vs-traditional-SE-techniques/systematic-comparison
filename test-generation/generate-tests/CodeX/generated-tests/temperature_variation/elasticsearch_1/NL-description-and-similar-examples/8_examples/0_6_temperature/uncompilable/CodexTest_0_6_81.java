import org.elasticsearch.action.index.*;
import org.elasticsearch.ElasticsearchGenerationException;
import org.elasticsearch.Version;
import org.elasticsearch.action.ActionRequestValidationException;
import org.elasticsearch.action.CompositeIndicesRequest;
import org.elasticsearch.action.DocWriteRequest;
import org.elasticsearch.action.RoutingMissingException;
import org.elasticsearch.action.support.replication.ReplicatedWriteRequest;
import org.elasticsearch.action.support.replication.ReplicationRequest;
import org.elasticsearch.client.Requests;
import org.elasticsearch.cluster.metadata.MappingMetaData;
import org.elasticsearch.cluster.metadata.MetaData;
import org.elasticsearch.common.Nullable;
import org.elasticsearch.common.UUIDs;
import org.elasticsearch.common.bytes.BytesArray;
import org.elasticsearch.common.bytes.BytesReference;
import org.elasticsearch.common.io.stream.StreamInput;
import org.elasticsearch.common.io.stream.StreamOutput;
import org.elasticsearch.common.lucene.uid.Versions;
import org.elasticsearch.common.unit.ByteSizeValue;
import org.elasticsearch.common.unit.TimeValue;
import org.elasticsearch.common.xcontent.XContentBuilder;
import org.elasticsearch.common.xcontent.XContentFactory;
import org.elasticsearch.common.xcontent.XContentHelper;
import org.elasticsearch.common.xcontent.XContentType;
import org.elasticsearch.index.IndexSettings;
import org.elasticsearch.index.VersionType;
import org.elasticsearch.index.shard.ShardId;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import static org.elasticsearch.action.ValidateActions.addValidationError;
import java.util.*;

import org.elasticsearch.Version;
import org.elasticsearch.action.ActionRequestValidationException;
import org.elasticsearch.action.DocWriteRequest;
import org.elasticsearch.action.support.ActiveShardCount;
import org.elasticsearch.action.support.replication.ReplicationResponse;
import org.elasticsearch.common.bytes.BytesArray;
import org.elasticsearch.common.io.stream.BytesStreamOutput;
import org.elasticsearch.common.io.stream.StreamInput;
import org.elasticsearch.common.unit.ByteSizeValue;
import org.elasticsearch.common.xcontent.XContentType;
import org.elasticsearch.index.VersionType;
import org.elasticsearch.index.seqno.SequenceNumbers;
import org.elasticsearch.index.shard.ShardId;
import org.elasticsearch.rest.RestStatus;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_81 { 
  @Test
    public void testParent() {
        String parent = UUID.randomUUID().toString();
        String id = UUID.randomUUID().toString();
        String type = UUID.randomUUID().toString();
        String routing = UUID.randomUUID().toString();
        long version = randomLong();
        long versionType = randomLong();
        DocWriteRequest.OpType opType = randomFrom(DocWriteRequest.OpType.values());
        BytesReference source = randomBytesReference();
        boolean hasSource = randomBoolean();
        IndexRequest indexRequest = new IndexRequest(index, type, id, source);
        if (randomBoolean()) {
            indexRequest.routing(routing);
        }
        if (randomBoolean()) {
            indexRequest.parent(parent);
        }
        if (randomBoolean()) {
            indexRequest.version(version);
        }
        if (randomBoolean()) {
            indexRequest.versionType(VersionType.fromValue(versionType));
        }
        if (randomBoolean()) {
            indexRequest.setPipeline(randomAlphaOfLengthBetween(1, 10));
        }
        if (randomBoolean()) {
            indexRequest.setRefreshPolicy(randomFrom(WriteRequest.RefreshPolicy.values()));
        }
        if (randomBoolean()) {
            indexRequest.timeout(TimeValue.parseTimeValue(randomPositiveTimeValue(), getClass().getSimpleName() + ".timeout"));
        }
        if (randomBoolean()) {
            indexRequest.setIfSeqNo(randomNonNegativeLong());
        }
        if (randomBoolean()) {
            indexRequest.setIfPrimaryTerm(randomNonNegativeLong());
        }
        if (randomBoolean()) {
            indexRequest.opType(opType);
        }
        assertEquals(index, indexRequest.index());
        assertEquals(type, indexRequest.type());
        assertEquals(id, indexRequest.id());
        assertEquals(routing, indexRequest.routing());
        assertEquals(parent, indexRequest.parent());

}