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


public class CodexTest_0_5_10 { 
  @Test
    public void testParent() {
        String parent = "parent";
        String child = "child";
        String grandChild = "grandChild";
        String grandChild2 = "grandChild2";
        String grandChild3 = "grandChild3";
        String grandChild4 = "grandChild4";
        String grandChild5 = "grandChild5";
        String grandChild6 = "grandChild6";
        String grandChild7 = "grandChild7";
        String grandChild8 = "grandChild8";
        String grandChild9 = "grandChild9";
        String grandChild10 = "grandChild10";
        String grandChild11 = "grandChild11";
        String grandChild12 = "grandChild12";
        String grandChild13 = "grandChild13";
        String grandChild14 = "grandChild14";
        String grandChild15 = "grandChild15";
        String grandChild16 = "grandChild16";
        String grandChild17 = "grandChild17";
        String grandChild18 = "grandChild18";
        String grandChild19 = "grandChild19";
        String grandChild20 = "grandChild20";
        String grandChild21 = "grandChild21";
        String grandChild22 = "grandChild22";
        String grandChild23 = "grandChild23";
        String grandChild24 = "grandChild24";
        String grandChild25 = "grandChild25";
        String grandChild26 = "grandChild26";
        String grandChild27 = "grandChild27";
        String grandChild28 = "grandChild28";
        String grandChild29 = "grandChild29";
        String grandChild30 = "grandChild30";
        String grandChild31 = "grandChild31";
        String grandChild32 = "grandChild32";
        String grandChild33 = "grandChild33";
        String grandChild34 = "grandChild34";
        String grandChild35 = "grandChild35";
        String grandChild36 = "grandChild36";
        String grandChild37 = "grandChild37";
        String grandChild38 = "grandChild38";
        String grandChild39 = "grandChild39";
        String grandChild40 = "grandChild40
}