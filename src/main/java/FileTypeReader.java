import org.apache.commons.io.FilenameUtils;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 16/04/2014
 * Time: 11:34 AM
 * To change this template use File | Settings | File Templates.
 */
public class FileTypeReader {

    public String fileType(String filePath){

        return FilenameUtils.getExtension(filePath);

    }

    public static  void main(String a[]){

        System.out.println(new FileTypeReader().fileType("hs_err_pid1.log")) ;
    }
}
