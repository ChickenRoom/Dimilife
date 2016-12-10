package chickens.org.dimilife.InsideFragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import chickens.org.dimilife.R;
import chickens.org.dimilife.ScheduleManage;
import chickens.org.dimilife.UserManager;
import chickens.org.dimilife.Widget.NotoRegularTextView;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link InsideFragmentFirst.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link InsideFragmentFirst#newInstance} factory method to
 * create an instance of this fragment.
 */
public class InsideFragmentFirst extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String[] teachers = new String[7];

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private TextView textView;

    private OnFragmentInteractionListener mListener;

    public InsideFragmentFirst() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment InsideFragmentFirst.
     */
    // TODO: Rename and change types and number of parameters
    public static InsideFragmentFirst newInstance(String param1, String param2) {
        InsideFragmentFirst fragment = new InsideFragmentFirst();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_inside_first, container, false);
        textView = (TextView)view.findViewById(R.id.classname);
        textView.setText(String.valueOf(UserManager.getInstance().getSerial()));

        LinearLayout linearLayout = (LinearLayout)view.findViewById(R.id.linear1);
        for(int i = 1 ; i <= 4 ; i++) {
            Log.e("i",String.valueOf(i));
            NotoRegularTextView tView = new NotoRegularTextView(getContext());
            tView.setPadding(0,6,0,3);
            tView.setText(String.valueOf(i) + "교시");
            Log.e("mon",ScheduleManage.getInstance().getTwo_five_mon()[i]);
            tView.setTextColor(getResources().getColor(R.color.buttonSelected));
            linearLayout.addView(tView);
        }
        NotoRegularTextView teView = new NotoRegularTextView(getContext());
        teView.setText("점심시간");
        teView.setPadding(0,6,0,3);
        teView.setTextColor(getResources().getColor(R.color.buttonSelected));
        linearLayout.addView(teView);
        for(int i = 5 ; i <= 7 ; i++) {
            Log.e("i",String.valueOf(i));
            NotoRegularTextView textView = new NotoRegularTextView(getActivity());
            textView.setPadding(0,6,0,3);
            textView.setText(String.valueOf(i) + "교시");
            textView.setTextColor(getResources().getColor(R.color.buttonSelected));
            linearLayout.addView(textView);
        }
        NotoRegularTextView teaView = new NotoRegularTextView(getContext());
        teaView.setText("저녁시간");
        teaView.setPadding(0,6,0,3);
        teaView.setTextColor(getResources().getColor(R.color.buttonSelected));
        linearLayout.addView(teaView);
        NotoRegularTextView teapView = new NotoRegularTextView(getContext());
        teapView.setText("야자1타임");
        teapView.setPadding(0,6,0,3);
        teapView.setTextColor(getResources().getColor(R.color.buttonSelected));
        linearLayout.addView(teapView);
        NotoRegularTextView teaaView = new NotoRegularTextView(getContext());
        teaaView.setText("야자2타임");
        teaaView.setPadding(0,6,0,3);
        teaaView.setTextColor(getResources().getColor(R.color.buttonSelected));
        linearLayout.addView(teaaView);


        LinearLayout linearLayout1 = (LinearLayout)view.findViewById(R.id.linear2);
        for(int i = 0 ; i < 4; i++) {
            Log.e("i",String.valueOf(i));
            NotoRegularTextView tView = new NotoRegularTextView(getContext());
            tView.setPadding(0,6,0,3);
            tView.setText(ScheduleManage.getInstance().getTwo_five_mon()[i]);
            Log.e("mon",ScheduleManage.getInstance().getTwo_five_mon()[i]);
            tView.setTextColor(getResources().getColor(R.color.buttonSelected));
            linearLayout1.addView(tView);
        }
        NotoRegularTextView texView = new NotoRegularTextView(getContext());
        texView.setText("점심시간");
        texView.setPadding(0,6,0,3);
        texView.setTextColor(getResources().getColor(R.color.buttonSelected));
        linearLayout1.addView(texView);
        for(int i = 4 ; i < 7 ; i++) {
            Log.e("i",String.valueOf(i));
            NotoRegularTextView textView = new NotoRegularTextView(getActivity());
            textView.setPadding(0,6,0,3);
            textView.setText(ScheduleManage.getInstance().getTwo_five_mon()[i]);
            textView.setTextColor(getResources().getColor(R.color.buttonSelected));
            linearLayout1.addView(textView);
        }
        NotoRegularTextView teaasView = new NotoRegularTextView(getContext());
        teaasView.setText("저녁시간");
        teaasView.setPadding(0,6,0,3);
        teaasView.setTextColor(getResources().getColor(R.color.buttonSelected));
        linearLayout1.addView(teaasView);
        NotoRegularTextView teapaView = new NotoRegularTextView(getContext());
        teapaView.setText("야자1타임");
        teapaView.setPadding(0,6,0,3);
        teapaView.setTextColor(getResources().getColor(R.color.buttonSelected));
        linearLayout1.addView(teapaView);
        NotoRegularTextView teawaView = new NotoRegularTextView(getContext());
        teawaView.setText("야자2타임");
        teawaView.setPadding(0,6,0,3);
        teawaView.setTextColor(getResources().getColor(R.color.buttonSelected));
        linearLayout1.addView(teawaView);

        getTeacherName(ScheduleManage.getInstance().getTwo_five_mon());




        LinearLayout linearLayout2 = (LinearLayout)view.findViewById(R.id.linear3);
        for(int i = 0 ; i < 4; i++) {
            Log.e("i",String.valueOf(i));
            NotoRegularTextView tView = new NotoRegularTextView(getContext());
            tView.setPadding(0,6,0,3);
            tView.setText(teachers[i]);
            Log.e("mon",teachers[i]);
            tView.setTextColor(getResources().getColor(R.color.buttonSelected));
            linearLayout2.addView(tView);
        }
        NotoRegularTextView tex1View = new NotoRegularTextView(getContext());
        tex1View.setText("");
        tex1View.setPadding(0,6,0,3);
        tex1View.setTextColor(getResources().getColor(R.color.buttonSelected));
        linearLayout2.addView(tex1View);
        for(int i = 4 ; i < 7 ; i++) {
            Log.e("i",String.valueOf(i));
            NotoRegularTextView textView = new NotoRegularTextView(getActivity());
            textView.setPadding(0,6,0,3);
            textView.setText(teachers[i]);
            textView.setTextColor(getResources().getColor(R.color.buttonSelected));
            linearLayout2.addView(textView);
        }





        return view;



    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

    private void getTeacherName(String[] timeline) {
        for (int i = 0; i < timeline.length; i++) {
            switch (timeline[i]) {
                case("미적분") :
                    teachers[i] = "이병혁 선생님";
                    break;
                case ("광고"):
                    teachers[i] = "정희범 선생님";
                    break;
                case ("중국어"):
                    teachers[i] = "정지훈 선생님";
                    break;
                case ("체육"):
                    teachers[i] = "이재민 선생님";
                    break;
                case ("공수A"):
                    teachers[i] = "김세희 선생님";
                    break;
                case ("문학"):
                    teachers[i] = "허관무 선생님";
                    break;
                case ("자바"):
                    teachers[i] = "이호선 선생님";
                    break;
                case ("진로"):
                    teachers[i] = "담당선생님";
                    break;
                case ("영A"):
                    teachers[i] = "전유원 선생님";
                    break;
                case ("회계"):
                    teachers[i] = "엄진영 선생님";
                    break;
                case ("음악"):
                    teachers[i] = "정다움 선생님";
                    break;
                case ("영B"):
                    teachers[i] = "양재덕 선생님";
                    break;
                case ("3D"):
                    teachers[i] = "안수진 선생님";
                    break;
                case ("디자인"):
                    teachers[i] = "하성봉 선생님";
                    break;
                case ("공업"):
                    teachers[i] = "하미영 선생님";
                    break;
                case ("물리"):
                    teachers[i] = "김상욱 선생님";
                    break;
                case ("화학"):
                    teachers[i] = "김종수 선생님";
                    break;
            }
        }
    }


}
