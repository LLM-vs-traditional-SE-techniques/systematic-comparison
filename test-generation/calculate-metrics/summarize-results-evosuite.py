import pandas as pd

modes = ["evosuite"]
methods = ["colt_1", "colt_2",
           "elasticsearch_1", "elasticsearch_2",
           "gwt_1", "gwt_2",
           "graphstream_1", "graphstream_2",
           "guava_1", "guava_2",
           "jdk_1", "jdk_2",
           "hibernate_1", "hibernate_2",
           "math_1", "math_2",
           "weka_1", "weka_2"]

coverages_per_method = []
total_lines = 0
total_lines_covered = 0
percentage_coverage = 0
for mode in modes:
    for method in methods:
        metrics_file_path = f"./reports/{mode}/{method}.csv"
        metrics_file = pd.read_csv(metrics_file_path)
        
        lines = metrics_file.iloc[0]['LINE_COVERED'] + metrics_file.iloc[0]['LINE_MISSED']
        lines_covered = metrics_file.iloc[0]['LINE_COVERED']
        
        coverage_per_method = lines_covered / lines if lines > 0 else 0.0
        coverages_per_method.append(coverage_per_method)
        
        total_lines += lines
        total_lines_covered += lines_covered
    percentage_coverage = total_lines_covered / total_lines

metrics = pd.DataFrame({
    'methods': methods + ['total_lines', 'total_lines_covered', 'percentage_coverage'],
    'coverage': coverages_per_method + [total_lines, total_lines_covered, percentage_coverage]
})
metrics.to_csv('./metrics_evosuite.csv', index=False)