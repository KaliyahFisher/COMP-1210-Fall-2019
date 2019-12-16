/**
 *This program calculates a student's grade.
 *@author Kaffeein Bellamy
 *@version 20/9/2019
 */
public class Grade {
   private double exam1;
   private double exam2;
   private double finalExam;
   private double activityAvg;
   private double quizAvg;
   private double projectAvg;
   private String studentName;
 /**
 *These are the constants for the grade calculator.
 */
   public static final int EXAM_1 = 1, EXAM_2 = 2, FINAL = 3;
   private static final double EXAM_WEIGHT = 0.15,
      FINAL_WEIGHT = 0.30, ACT_WEIGHT = 0.05,
      QUIZ_WEIGHT = 0.10, PROJ_WEIGHT = 0.25;

    /**
    * Class holds grade parameters.
    * @param studentNameIn is the student name
    */
    // to use a setter (setVariableName), you call it in one method
    //but must define it in another method.
   public Grade(String studentNameIn) {
      setName(studentNameIn);
   }
  // this method defines setName to allow the programmer to call it.
  // code will throw errors if you only
  // have setVariableName without a definition. 
  //typically, setters are declared public void
  
    /** 
    * Method sets student name.
    * @param studentNameIn is the student name
    */
   public void setName(String studentNameIn) {
      studentName = studentNameIn;
   }
   /** 
    * Method sets student name.
    * @return studentName gives back the student name
    */
   public String getName() {
      return studentName;
   }
    /** 
    * Method sets quiz and activity averages.
    * @param activityAvgIn is activity average.
    * @param quizAvgIn is the quiz average.
    */
   public void setLabAverages(double activityAvgIn, double quizAvgIn) {
      activityAvg = activityAvgIn;
      quizAvg = quizAvgIn;
   }
    /** 
    * Method sets quiz and activity averages.
    * @param projectAvgIn is project average.
    */
   public void setProjectAvg(double projectAvgIn) {
      projectAvg = projectAvgIn; 
   }
    /** Method determines exam score from exam type. 
    * @param examType is determines exam.
    * @param examScoreIn is the exam's numerical score.
    */
   public void setExamScore(int examType, double examScoreIn) {
      if (examType == EXAM_1) {
         exam1 = examScoreIn;
      }
      else if (examType == EXAM_2) {
         exam2 = examScoreIn;
      }
      else if (examType == FINAL) {
         finalExam = examScoreIn;
      }
   }
    /** 
    * Method calculates grade.
    * @return gives grade.
    */
   public double calculateGrade() {
      double grade = exam1 * EXAM_WEIGHT + exam2 * EXAM_WEIGHT
                  + finalExam * FINAL_WEIGHT
                  + activityAvg * ACT_WEIGHT
                  + quizAvg * QUIZ_WEIGHT
                  + projectAvg * PROJ_WEIGHT;
      return grade;
   }
   /** 
    * Method organizes data and returns student name and grades.
    * @return gives final output
    */
   public String toString() {
      return "Name: " + getName() + "\n"
            + "Course Grade: " + calculateGrade();
   }
}  
