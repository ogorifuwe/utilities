import java.util.List;
import java.util.ArrayList;

class HiddenFiles {
  
  File[] hiddenFiles = new File(".").listFiles(new FileFilter() {
    public boolean accept(File file) {
      return file.isHidden();
    }
  });

  File[] hiddenFiles = new File(".").listFiles(File::isHidden);
}
