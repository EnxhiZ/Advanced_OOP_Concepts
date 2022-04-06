
        public class Task {
            public static void main(String[] args){
                Person p = new Person("Kim Possible","2000-01-01");
                p.setPosition("Associate", 34000);
                Resume r = new Resume(p);
                Resume.Education education = r.new Education("NEIU", "Computer Science");
                r.addEducation(education);
                Resume.Experience experience1 = new Resume.Experience("Plumber", 2002, 2012);
                r.addExperience(experience1);
                r.addExperience(new Resume.Experience("Doctor", 1999, 2022));
                r.addExperience(new Resume.Experience("Teacher", 1985, 2008));
                System.out.println(r); //watch the resume print.

            }
        }

