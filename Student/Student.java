public class Student
    {

        String name;
        int rollNo;
        String Department;
        float cgpa;
        float attandance;


         Student(String name, int rollNo, String Department, float cgpa, float attandance )
        {
            this.name=name;
            this.rollNo=rollNo;
            this.Department=Department;
            this.cgpa=cgpa;
            this.attandance=attandance;
        }

        public  static Student MaxCgpa( Student[] arr )
        {

            Student  max =arr[0];

            for(int i=1; i<arr.length;i++)
            {
                if(max.cgpa < arr[i].cgpa)
                {
                    max=arr[i];
                }

                Student temp =arr[i];
            }
            return max;

        }


        public static  Student lowAt( Student[] arr )
        {

            Student  min =arr[0];

            for(int i=1; i<arr.length;i++)
            {
                if(min.attandance > arr[i].attandance)
                {
                    min=arr[i];
                }
            }
            return min;

        }

        public  static void sort(Student[] arr)
        {

            for(int i=0;i<arr.length-1;i++)
            {
                for(int j=0;j<arr.length-1-i;j++)
                {
                    if(arr[j].rollNo > arr[j+1].rollNo)
                    {

                        Student temp =arr[i];
                        arr[j]=arr[j+1];
                        arr[j+1] =temp;

                    }

                }
            }



        }

        public static void ShowDeties(Student[] arr)
        {
            for(Student stu : arr)
            {
                System.out.println(stu.name);
                System.out.println(stu.rollNo);
                System.out.println(stu.Department);
                System.out.println(stu.cgpa);
                System.out.println(stu.attandance);
            }


        }



    }



