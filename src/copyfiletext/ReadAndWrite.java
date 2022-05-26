package copyfiletext;

import java.io.*;

public class ReadAndWrite {
    public void readFile(String filePath){
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null ){
                System.out.println(line);
            }
            br.close();
        } catch (Exception e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
    }
    public void writeFile(String filePath){
        try {
            File file = new File("sourcefile");
            File file2 = new File(filePath);
            FileWriter writer = new FileWriter(file2, true);
//            if (file2.exists()) {
//                throw new AlreadyExistException();
//            }
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line + "\n");
            }
            bufferedReader.close();
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
