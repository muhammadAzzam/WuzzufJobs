package Jobs;

import java.util.Locale;

public class JobDetails {
    private String Title;
    private String Company;
    private String Location;
    private String Type;
    private String Level;
    private String YearsExp;
    private String Country;
    private String Skills;

    public void setYearsExp(String yearsExp) {
        YearsExp = yearsExp;
    }

    public String getYearsExp() {
        return YearsExp;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setCompany(String company) {
        Company = company;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public void setType(String type) {
        Type = type;
    }

    public void setLevel(String level) {
        Level = level;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public void setSkills(String skills) {
        Skills = skills;
    }

    public String getTitle() {
        return Title;
    }

    public String getCompany() {
        return Company;
    }

    public String getLocation() {
        return Location;
    }

    public String getType() {
        return Type;
    }

    public String getLevel() {
        return Level;
    }

    public String getCountry() {
        return Country;
    }

    public String getSkills() {
        return Skills;
    }
}