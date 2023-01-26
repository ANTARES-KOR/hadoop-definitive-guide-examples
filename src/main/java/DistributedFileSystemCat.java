import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.hdfs.DistributedFileSystem;
import org.apache.hadoop.io.IOUtils;

import java.io.InputStream;
import java.net.URI;

public class DistributedFileSystemCat {

    public static void main(String[] args) throws Exception {

        String uri = args[0];
        Configuration conf = new Configuration();

        DistributedFileSystem dfs = (DistributedFileSystem) DistributedFileSystem.get(URI.create(uri), conf);
        InputStream in = null;

        try {
            in = dfs.open(new Path(uri));
            IOUtils.copyBytes(in, System.out, 4096, false);
        } finally {
            IOUtils.closeStream(in);
        }
    }
}
