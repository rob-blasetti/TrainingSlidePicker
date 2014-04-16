/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 16/04/2014
 * Time: 11:20 AM
 * To change this template use File | Settings | File Templates.
 */
public class ValidatePresentationFileType {

      public boolean isValid(String filePath){
          boolean result=false;
          FileTypeReader fileTypeReader=new FileTypeReader();
          if(fileTypeReader.fileType(filePath).equals("ptt")){
              result=true;
          } else if(fileTypeReader.fileType(filePath).equals("pptx")){
              result=true;
          }
          return result;

      }
}
