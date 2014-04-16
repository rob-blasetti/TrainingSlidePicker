import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 16/04/2014
 * Time: 11:18 AM
 * To change this template use File | Settings | File Templates.
 */
public class ValidatePresentationFileTypeTest {
    ValidatePresentationFileType validatePresentationFileType;

    @Before
    public void setUp(){
        validatePresentationFileType=new ValidatePresentationFileType();

    }
    @Test
    public void CheckFileTypeIsValid(){
        FileTypeReader fileTypeReader= mock(FileTypeReader.class);
        when(fileTypeReader.fileType("test.ptt")) .thenReturn("ptt");
        when(fileTypeReader.fileType("test.pptx")).thenReturn("pptx");

        Assert.assertTrue(validatePresentationFileType.isValid("test.ptt"));
        Assert.assertTrue(validatePresentationFileType.isValid("test.pptx"));
    }

    @Test
    public void CheckFileIsInvalid(){

        Assert.assertFalse(validatePresentationFileType.isValid("tesjjjt.pzz23"));
    }
}
