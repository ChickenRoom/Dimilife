package chickens.org.dimilife;

/**
 * Created by JunHyeok on 2016. 12. 10..
 */
public class ScheduleManage {
    private String[] one_one_mon = {};
    private String[] one_one_tue = {};
    private String[] one_one_wed = {};
    private String[] one_one_thu = {};
    private String[] one_one_fri = {};

    private String[] one_two_mon = {"역사","사회","체육","수2","국1","플밍","진로"};
    private String[] one_two_tue = {"영A","국어","진로","사회","미술","미술","창체"};
    private String[] one_two_wed = {"사회","플밍","그B","과학","상경","역사","자습"};
    private String[] one_two_thu = {"상경","영B","그A","그A","수2","체육","동아리"};
    private String[] one_two_fri = {"플밍","영A","사회","국1","수2","역사","상경"};

    private String[] one_three_mon = {"컴그B","수2","플밍","한국사","정통","영B","기제"};
    private String[] one_three_tue = {"수2","진로","체육","영A","기제","역사","창체"};
    private String[] one_three_wed = {"국어","플밍","음악","수2","과학","기제","자습"};
    private String[] one_three_thu = {"영A","정통","진로","체육","플밍","음악","동아리"};
    private String[] one_three_fri = {"정통","플밍","역사","음악","컴그A","컴그A","국어"};

    private String[] one_four_mon = {"기제","역사","정통","국어","영A","플밍","수2"};
    private String[] one_four_tue = {"영B","플밍","역사","음악","정통","수2","창체"};
    private String[] one_four_wed = {"기제","과학","수2","진로","컴그B","음악","자습"};
    private String[] one_four_thu = {"국어","음악","영A","진로","체육","플밍","동아리"};
    private String[] one_four_fri = {"기제","컴그A","컴그B","정통","역사","체육","플밍"};

    private String[] one_five_mon = {"플밍","수2","컴그A","컴그A","체육","영B","국어"};
    private String[] one_five_tue = {"정통","역사","국어","플밍","수2","영A","창체"};
    private String[] one_five_wed = {"역사","진로","과학","기제","미술","미술","자습"};
    private String[] one_five_thu = {"정통","진로","플밍","국어","기제","역사","동아리"};
    private String[] one_five_fri = {"수2","기제","정통","체육","플밍","영A","컴그B"};

    private String[] one_six_mon = {"국어","기제","진로","영A","플밍","수2","체육"};
    private String[] one_six_tue = {"진로","수2","컴그A","컴그A","플밍","정통","창체"};
    private String[] one_six_wed = {"플밍","정통","기제","국어","역사","과학","자습"};
    private String[] one_six_thu = {"플밍","미술","미술","역사","영A","수2","동아리"};
    private String[] one_six_fri = {"역사","국어","체육","컴그A","영B","정통","기제"};

    private String[] two_one_mon = {"체욱","3D","3D","영A","회계","음악","음악"};
    private String[] two_one_tue = {"디자인","영어B","체육,","수학","진로","문학","창체"};
    private String[] two_one_wed = {"수학","진로","디자인","중국어","문학","3D","자습"};
    private String[] two_one_thu = {"수학","진로","광고","광고","회계","디자인","동아리"};
    private String[] two_one_fri = {"음악","음악","광고","광고","중국어","회계","영"};

    private String[] two_two_mon = {"디자인","회계","음악","음악","광고","광고","문학"};
    private String[] two_two_tue = {"체육","음악","음악","3D","영B","디자인","창체"};
    private String[] two_two_wed = {"디자인","중국어","체육","문학","회계","수학","자습"};
    private String[] two_two_thu = {"문학","진로","수학","영A","3D","3D","동아리"};
    private String[] two_two_fri = {"중국어","수학","진로","회계","영B","광고","광고"};

    private String[] two_three_mon = {};
    private String[] two_three_tue = {};
    private String[] two_three_wed = {};
    private String[] two_three_thu = {};
    private String[] two_three_fri = {};

    private String[] two_four_mon = {"자바","문학","물리","진로","3D","3D","미적분"};
    private String[] two_four_tue = {"공수B","화학","중국어","공업","문학","영B","창체"};
    private String[] two_four_wed = {"공수A","자바","미적분","영어B","체육","진로","자습"};
    private String[] two_four_thu = {"자바","공업","공수","화학","물리","중국어","동아리"};
    private String[] two_four_fri = {"영A","물리","자바","공업","체육","미적분","화학"};

    private String[] two_five_mon = {"영B","자바","중국어","화학","미적분","물리","진로"};
    private String[] two_five_tue = {"3D","3D","문학","물리","화학","공수B","창체"};
    private String[] two_five_wed = {"미적분","영A","자바","공수A","체육","공업","자습"};
    private String[] two_five_thu = {"공수A","미적분","물리","문학","자바","공업","동아리"};
    private String[] two_five_fri = {"체육","자바","중국어","영B","화학","진로","공업"};

    private String[] two_six_mon = {"중국어","미적분","화학","진로","자바","영B","물리"};
    private String[] two_six_tue = {"물리","공수B","공수A","화학","자바","체육","창체"};
    private String[] two_six_wed = {"공업","문학","3D","3D","영A","진로","자습"};
    private String[] two_six_thu = {"물리","중국어","공업","자바","미적분","영B","동아리"};
    private String[] two_six_fri = {"문학","화학","공업","체육","미적분","자바","공수A"};


    private static ScheduleManage ourInstance = new ScheduleManage();

    public static ScheduleManage getInstance() {
        return ourInstance;
    }

    private ScheduleManage() {
    }

    public String[] getOne_one_mon() {
        return one_one_mon;
    }

    public void setOne_one_mon(String[] one_one_mon) {
        this.one_one_mon = one_one_mon;
    }

    public String[] getOne_one_tue() {
        return one_one_tue;
    }

    public void setOne_one_tue(String[] one_one_tue) {
        this.one_one_tue = one_one_tue;
    }

    public String[] getOne_one_wed() {
        return one_one_wed;
    }

    public void setOne_one_wed(String[] one_one_wed) {
        this.one_one_wed = one_one_wed;
    }

    public String[] getOne_one_thu() {
        return one_one_thu;
    }

    public void setOne_one_thu(String[] one_one_thu) {
        this.one_one_thu = one_one_thu;
    }

    public String[] getOne_one_fri() {
        return one_one_fri;
    }

    public void setOne_one_fri(String[] one_one_fri) {
        this.one_one_fri = one_one_fri;
    }

    public String[] getOne_two_mon() {
        return one_two_mon;
    }

    public void setOne_two_mon(String[] one_two_mon) {
        this.one_two_mon = one_two_mon;
    }

    public String[] getOne_two_tue() {
        return one_two_tue;
    }

    public void setOne_two_tue(String[] one_two_tue) {
        this.one_two_tue = one_two_tue;
    }

    public String[] getOne_two_wed() {
        return one_two_wed;
    }

    public void setOne_two_wed(String[] one_two_wed) {
        this.one_two_wed = one_two_wed;
    }

    public String[] getOne_two_thu() {
        return one_two_thu;
    }

    public void setOne_two_thu(String[] one_two_thu) {
        this.one_two_thu = one_two_thu;
    }

    public String[] getOne_two_fri() {
        return one_two_fri;
    }

    public void setOne_two_fri(String[] one_two_fri) {
        this.one_two_fri = one_two_fri;
    }

    public String[] getOne_three_mon() {
        return one_three_mon;
    }

    public void setOne_three_mon(String[] one_three_mon) {
        this.one_three_mon = one_three_mon;
    }

    public String[] getOne_three_tue() {
        return one_three_tue;
    }

    public void setOne_three_tue(String[] one_three_tue) {
        this.one_three_tue = one_three_tue;
    }

    public String[] getOne_three_wed() {
        return one_three_wed;
    }

    public void setOne_three_wed(String[] one_three_wed) {
        this.one_three_wed = one_three_wed;
    }

    public String[] getOne_three_thu() {
        return one_three_thu;
    }

    public void setOne_three_thu(String[] one_three_thu) {
        this.one_three_thu = one_three_thu;
    }

    public String[] getOne_three_fri() {
        return one_three_fri;
    }

    public void setOne_three_fri(String[] one_three_fri) {
        this.one_three_fri = one_three_fri;
    }

    public String[] getOne_four_mon() {
        return one_four_mon;
    }

    public void setOne_four_mon(String[] one_four_mon) {
        this.one_four_mon = one_four_mon;
    }

    public String[] getOne_four_tue() {
        return one_four_tue;
    }

    public void setOne_four_tue(String[] one_four_tue) {
        this.one_four_tue = one_four_tue;
    }

    public String[] getOne_four_wed() {
        return one_four_wed;
    }

    public void setOne_four_wed(String[] one_four_wed) {
        this.one_four_wed = one_four_wed;
    }

    public String[] getOne_four_thu() {
        return one_four_thu;
    }

    public void setOne_four_thu(String[] one_four_thu) {
        this.one_four_thu = one_four_thu;
    }

    public String[] getOne_four_fri() {
        return one_four_fri;
    }

    public void setOne_four_fri(String[] one_four_fri) {
        this.one_four_fri = one_four_fri;
    }

    public String[] getOne_five_mon() {
        return one_five_mon;
    }

    public void setOne_five_mon(String[] one_five_mon) {
        this.one_five_mon = one_five_mon;
    }

    public String[] getOne_five_tue() {
        return one_five_tue;
    }

    public void setOne_five_tue(String[] one_five_tue) {
        this.one_five_tue = one_five_tue;
    }

    public String[] getOne_five_wed() {
        return one_five_wed;
    }

    public void setOne_five_wed(String[] one_five_wed) {
        this.one_five_wed = one_five_wed;
    }

    public String[] getOne_five_thu() {
        return one_five_thu;
    }

    public void setOne_five_thu(String[] one_five_thu) {
        this.one_five_thu = one_five_thu;
    }

    public String[] getOne_five_fri() {
        return one_five_fri;
    }

    public void setOne_five_fri(String[] one_five_fri) {
        this.one_five_fri = one_five_fri;
    }

    public String[] getOne_six_mon() {
        return one_six_mon;
    }

    public void setOne_six_mon(String[] one_six_mon) {
        this.one_six_mon = one_six_mon;
    }

    public String[] getOne_six_tue() {
        return one_six_tue;
    }

    public void setOne_six_tue(String[] one_six_tue) {
        this.one_six_tue = one_six_tue;
    }

    public String[] getOne_six_wed() {
        return one_six_wed;
    }

    public void setOne_six_wed(String[] one_six_wed) {
        this.one_six_wed = one_six_wed;
    }

    public String[] getOne_six_thu() {
        return one_six_thu;
    }

    public void setOne_six_thu(String[] one_six_thu) {
        this.one_six_thu = one_six_thu;
    }

    public String[] getOne_six_fri() {
        return one_six_fri;
    }

    public void setOne_six_fri(String[] one_six_fri) {
        this.one_six_fri = one_six_fri;
    }

    public String[] getTwo_one_mon() {
        return two_one_mon;
    }

    public void setTwo_one_mon(String[] two_one_mon) {
        this.two_one_mon = two_one_mon;
    }

    public String[] getTwo_one_tue() {
        return two_one_tue;
    }

    public void setTwo_one_tue(String[] two_one_tue) {
        this.two_one_tue = two_one_tue;
    }

    public String[] getTwo_one_wed() {
        return two_one_wed;
    }

    public void setTwo_one_wed(String[] two_one_wed) {
        this.two_one_wed = two_one_wed;
    }

    public String[] getTwo_one_thu() {
        return two_one_thu;
    }

    public void setTwo_one_thu(String[] two_one_thu) {
        this.two_one_thu = two_one_thu;
    }

    public String[] getTwo_one_fri() {
        return two_one_fri;
    }

    public void setTwo_one_fri(String[] two_one_fri) {
        this.two_one_fri = two_one_fri;
    }

    public String[] getTwo_two_mon() {
        return two_two_mon;
    }

    public void setTwo_two_mon(String[] two_two_mon) {
        this.two_two_mon = two_two_mon;
    }

    public String[] getTwo_two_tue() {
        return two_two_tue;
    }

    public void setTwo_two_tue(String[] two_two_tue) {
        this.two_two_tue = two_two_tue;
    }

    public String[] getTwo_two_wed() {
        return two_two_wed;
    }

    public void setTwo_two_wed(String[] two_two_wed) {
        this.two_two_wed = two_two_wed;
    }

    public String[] getTwo_two_thu() {
        return two_two_thu;
    }

    public void setTwo_two_thu(String[] two_two_thu) {
        this.two_two_thu = two_two_thu;
    }

    public String[] getTwo_two_fri() {
        return two_two_fri;
    }

    public void setTwo_two_fri(String[] two_two_fri) {
        this.two_two_fri = two_two_fri;
    }

    public String[] getTwo_three_mon() {
        return two_three_mon;
    }

    public void setTwo_three_mon(String[] two_three_mon) {
        this.two_three_mon = two_three_mon;
    }

    public String[] getTwo_three_tue() {
        return two_three_tue;
    }

    public void setTwo_three_tue(String[] two_three_tue) {
        this.two_three_tue = two_three_tue;
    }

    public String[] getTwo_three_wed() {
        return two_three_wed;
    }

    public void setTwo_three_wed(String[] two_three_wed) {
        this.two_three_wed = two_three_wed;
    }

    public String[] getTwo_three_thu() {
        return two_three_thu;
    }

    public void setTwo_three_thu(String[] two_three_thu) {
        this.two_three_thu = two_three_thu;
    }

    public String[] getTwo_three_fri() {
        return two_three_fri;
    }

    public void setTwo_three_fri(String[] two_three_fri) {
        this.two_three_fri = two_three_fri;
    }

    public String[] getTwo_four_mon() {
        return two_four_mon;
    }

    public void setTwo_four_mon(String[] two_four_mon) {
        this.two_four_mon = two_four_mon;
    }

    public String[] getTwo_four_tue() {
        return two_four_tue;
    }

    public void setTwo_four_tue(String[] two_four_tue) {
        this.two_four_tue = two_four_tue;
    }

    public String[] getTwo_four_wed() {
        return two_four_wed;
    }

    public void setTwo_four_wed(String[] two_four_wed) {
        this.two_four_wed = two_four_wed;
    }

    public String[] getTwo_four_thu() {
        return two_four_thu;
    }

    public void setTwo_four_thu(String[] two_four_thu) {
        this.two_four_thu = two_four_thu;
    }

    public String[] getTwo_four_fri() {
        return two_four_fri;
    }

    public void setTwo_four_fri(String[] two_four_fri) {
        this.two_four_fri = two_four_fri;
    }

    public String[] getTwo_five_mon() {
        return two_five_mon;
    }

    public void setTwo_five_mon(String[] two_five_mon) {
        this.two_five_mon = two_five_mon;
    }

    public String[] getTwo_five_tue() {
        return two_five_tue;
    }

    public void setTwo_five_tue(String[] two_five_tue) {
        this.two_five_tue = two_five_tue;
    }

    public String[] getTwo_five_wed() {
        return two_five_wed;
    }

    public void setTwo_five_wed(String[] two_five_wed) {
        this.two_five_wed = two_five_wed;
    }

    public String[] getTwo_five_thu() {
        return two_five_thu;
    }

    public void setTwo_five_thu(String[] two_five_thu) {
        this.two_five_thu = two_five_thu;
    }

    public String[] getTwo_five_fri() {
        return two_five_fri;
    }

    public void setTwo_five_fri(String[] two_five_fri) {
        this.two_five_fri = two_five_fri;
    }

    public String[] getTwo_six_mon() {
        return two_six_mon;
    }

    public void setTwo_six_mon(String[] two_six_mon) {
        this.two_six_mon = two_six_mon;
    }

    public String[] getTwo_six_tue() {
        return two_six_tue;
    }

    public void setTwo_six_tue(String[] two_six_tue) {
        this.two_six_tue = two_six_tue;
    }

    public String[] getTwo_six_wed() {
        return two_six_wed;
    }

    public void setTwo_six_wed(String[] two_six_wed) {
        this.two_six_wed = two_six_wed;
    }

    public String[] getTwo_six_thu() {
        return two_six_thu;
    }

    public void setTwo_six_thu(String[] two_six_thu) {
        this.two_six_thu = two_six_thu;
    }

    public String[] getTwo_six_fri() {
        return two_six_fri;
    }

    public void setTwo_six_fri(String[] two_six_fri) {
        this.two_six_fri = two_six_fri;
    }
}
