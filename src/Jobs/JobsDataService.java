package Jobs;

import java.util.*;
import java.util.stream.Collectors;

public class JobsDataService {
    public static void FilterJobsByTitle(List<JobDetails> Jobs){
        int i=0;
        Map<String,Long> J_Title=new HashMap<String,Long>();
        while(i<Jobs.size()){
            if (J_Title.containsKey(Jobs.get(i).getTitle())){
                J_Title.put(Jobs.get(i).getTitle(),Long.valueOf(J_Title.get(Jobs.get(i).getTitle())+1));
            }else {
                J_Title.put(Jobs.get(i).getTitle(), 1L);
            }
            i++;
        }
        System.out.println(J_Title);
    }
    public static void FilterJobsByCountry(List<JobDetails> Jobs){
        int i=0;
        Map<String,Long> J_Country =new HashMap<String,Long>();
        while(i<Jobs.size()){
            if (J_Country.containsKey(Jobs.get(i).getCountry())){
                J_Country.put(Jobs.get(i).getCountry(),Long.valueOf(J_Country.get(Jobs.get(i).getCountry())+1));
            }else {
                J_Country.put(Jobs.get(i).getCountry(), 1L);
            }
            i++;
        }
        System.out.println(J_Country);
    }
    public static void FilterJobsByLevel(List<JobDetails> Jobs){
        int i=0;
        Map<String,Long> J_Level =new HashMap<String,Long>();
        while(i<Jobs.size()){
            if (J_Level.containsKey(Jobs.get(i).getLevel())){
                J_Level.put(Jobs.get(i).getLevel(),Long.valueOf(J_Level.get(Jobs.get(i).getLevel())+1));
            }else {
                J_Level.put(Jobs.get(i).getLevel(), 1L);
            }
            i++;
        }
        System.out.println(J_Level);
    }
    public static LinkedHashMap<String,Long> sortMap(Map<String,Long> map){
        LinkedHashMap<String, Long> sortedMap = map.entrySet().stream()
                .sorted(Comparator.comparingLong(e -> e.getValue()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> { throw new AssertionError(); },
                        LinkedHashMap::new
                ));
        return sortedMap;
    }
    public static void FilterJobsByYearsExp(List<JobDetails> Jobs){
        int i=0;
        Map<String,Long> J_YearsExp=new HashMap<String,Long>();
        while(i<Jobs.size()){
            if (J_YearsExp.containsKey(Jobs.get(i).getYearsExp())){
                J_YearsExp.put(Jobs.get(i).getYearsExp(),Long.valueOf(J_YearsExp.get(Jobs.get(i).getYearsExp())+1));
            }else {
                J_YearsExp.put(Jobs.get(i).getYearsExp(), 1L);
            }
            i++;
        }
        System.out.println(sortMap(J_YearsExp));
    }
}
