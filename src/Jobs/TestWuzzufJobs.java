
package Jobs;

import java.util.ArrayList;
import java.util.List;

public class TestWuzzufJobs {
    public static void test(){
        List<JobDetails> Jobs=IO.ReadCsvFile("Wuzzuf_Jobs.csv");
        JobsDataService.FilterJobsByCountry(Jobs);
        JobsDataService.FilterJobsByLevel(Jobs);
        JobsDataService.FilterJobsByTitle(Jobs);
        JobsDataService.FilterJobsByYearsExp(Jobs);
    }
}