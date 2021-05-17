package Jobs;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class IO {
    public static List<JobDetails> ReadCsvFile(String FileName)
    {
        String filename=FileName;
        List<JobDetails> Jobs=new ArrayList<JobDetails>();
        String line = "";

        try
        {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            while ((line = br.readLine()) != null)
            {
                String[] Phrase = line.split(",");
                if (Phrase[0].toLowerCase().equals("title")){
                    continue;
                }else {
                    JobDetails JDObject=new JobDetails();
                    JDObject.setTitle(Phrase[0]);
                    JDObject.setCompany(Phrase[1]);
                    JDObject.setLocation(Phrase[2]);
                    JDObject.setType(Phrase[3]);
                    JDObject.setLevel(Phrase[4]);
                    JDObject.setYearsExp(Phrase[5]);
                    JDObject.setCountry(Phrase[6]);
                    JDObject.setSkills(Phrase[7]);

                    Jobs.add(JDObject);
                }

            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return Jobs;
    }

}