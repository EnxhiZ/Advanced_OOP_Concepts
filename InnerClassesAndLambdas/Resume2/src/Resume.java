/* TODO */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Resume {
    public class Education {
        String school;
        String major;

        public Education(String school, String major) {
            this.school = school;
            this.major = major;
        }

        public String getSchool() {
            return school;
        }

        public String getMajor() {
            return major;
        }

        @Override
        public String toString() {
            return major + " at " + school;
        }
    }

    public static class Experience {
        String title;
        int fromYear;
        int toYear;

        public Experience(String title, int startYear, int endYear) {
            this.title = title;
            this.fromYear = startYear;
            this.toYear = endYear;

        }

        @Override
        public String toString() {
            return fromYear + "-" + toYear + ": " + title;
        }
    }

    private Person person;
    private List<Education> educationList;
    private PriorityQueue<Experience> experienceList;


    public Resume(Person p) {
        person = p;
        educationList = new ArrayList<>();
        experienceList = new PriorityQueue<>(new Comparator<Experience>() {
            @Override
            public int compare(Experience o1, Experience o2) {
                return o2.toYear - o1.toYear;
            }
        });
    }

    public PriorityQueue<Experience> getExperience() {
        return experienceList;
    }

    public void addEducation(Education ed) {
        educationList.add(ed);
    }

    public void addExperience(Experience ex) {
        experienceList.add(ex);
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();

        s.append(person.toString() + "\n");
        s.append("Experience\n");
        experienceList.forEach(item -> s.append(item + "\n"));
        s.append("Education\n");
        educationList.forEach(item -> s.append(item + "\n"));

        return s.toString();
    }




}
