package sg.edu.np.mad.madassignmentgrpanpaf;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class StudentP03 extends Fragment {

    // initialize
    private static final String ARG_PARAM1 = "P02";
    private static final String ARG_PARAM2 = "P03";
    // initialize recyclerview variable
    private RecyclerView recyclerView;
    // initialize student arrayList
    public ArrayList<students> studentList;
    viewAllStudentAdapter adapter;
    // initialize
    private String P03;
    private String P04;

    public StudentP03() {
        // Required empty public constructor
    }

    // new instance of fragment
    public static StudentP03 newInstance(String P03frag, String P04frag) {
        // initialize with new fragment.
        StudentP03 fragment = new StudentP03();
        // new bundle
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, P03frag);
        args.putString(ARG_PARAM2, P04frag);
        // set argument in fragment
        fragment.setArguments(args);
        // return the fragment
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            // if arguments is not null, get string for P03 and P04 parameters.
            P03 = getArguments().getString(ARG_PARAM1);
            P04 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_student_p03, container, false);
        // call the initialiseData method
        studentList = initialiseData();
        // find the id of the recyclerview
        recyclerView = view.findViewById(R.id.viewAllStudents);

        // initialise layout manager with context.
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(getContext());

        //initialise adapter
        adapter = new viewAllStudentAdapter(studentList,getContext());
        // set the layout manager for recyclerview
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        // set adapter
        recyclerView.setAdapter(adapter);

        // return the view
        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onStop() {
        super.onStop();
    }


    public ArrayList<students> initialiseData()
    {
        // initialize
        ArrayList<String> nameList = new ArrayList<String>();
        ArrayList<String> idList = new ArrayList<String>();

        // initialize db file and get the Activity
        P03Handler db = new P03Handler(getActivity());
        // set the studentList to get students from the db file
        ArrayList<students> studentList = db.getStudents();

        //creating 25 items for recyclerview
        if(studentList.size()==0) {
            // new students object
            students NewStudent = new students("Soh Yi Jie Jeff", "10222326", true);
            // add the object to the list
            studentList.add(NewStudent);
            // new students object
            students NewStudent2 = new students("Chua Ming Feng", "10227861", true);
            // add the object to the list
            studentList.add(NewStudent2);
            // new students object
            students NewStudent3 = new students("Thu Ya Swe", "10222373", true);
            // add the object to the list
            studentList.add(NewStudent3);
            // new students object
            students NewStudent4 = new students("Simon Kwek", "10228098",true);
            // add the object to the list
            studentList.add(NewStudent4);
            // new students object
            students NewStudent5 = new students ("Tan Wen Yu", "10203894", true);
            // add the object to the list
            studentList.add(NewStudent5);
            // new students object
            students NewStudent6 =  new students("Tang Ee Ann","10222484",true);
            // add the object to the list
            studentList.add(NewStudent6);
            // new students object
            students NewStudent7 = new students("Mah Chen Han","10219290",true);
            // add the object to the list
            studentList.add(NewStudent7);
            // new students object
            students NewStudent8 = new students("Sim Yuan Yee","10223621",true);
            // add the object to the list
            studentList.add(NewStudent8);
            // new students object
            students NewStudent9 = new students("Leon Toh", "10223268", true);
            // add the object to the list
            studentList.add(NewStudent9);
            // new students object
            students NewStudent10 = new students("Ali", "10223410", true);
            // add the object to the list
            studentList.add(NewStudent10);
            // new students object
            students NewStudent11 = new students("Lim Junquan Ryan", "10192609", true);
            // add the object to the list
            studentList.add(NewStudent11);
            // new students object
            students NewStudent12 = new students("Zi Yi Ng", "10222211",true);
            // add the object to the list
            studentList.add(NewStudent12);
            // new students object
            students NewStudent13 = new students("Paul Chuan","10222819", true);
            // add the object to the list
            studentList.add(NewStudent13);
            // new students object
            students NewStudent14 = new students("Lukman","10219568", true);
            // add the object to the list
            studentList.add(NewStudent14);
            // new students object
            students NewStudent15 =  new students("Lee Zhen Quan", "10228054", true);
            // add the object to the list
            studentList.add(NewStudent15);
            // new students object
            students NewStudent16 = new students("Logan", "10227699", true);
            // add the object to the list
            studentList.add(NewStudent16);
            // new students object
            students NewStudent17 = new students("Chua Jie Ren","10222145",true);
            // add the object to the list
            studentList.add(NewStudent17);
            // new students object
            students NewStudent18 = new students("Chua Guo Heng", "10223608",true);
            // add the object to the list
            studentList.add(NewStudent18);
            // new students object
            students NewStudent19 = new students("Chua Jie Yi Addison", "10222525", true);
            // add the object to the list
            studentList.add(NewStudent19);
            // new students object
            students NewStudent20 = new students("Liew Zheng Zhang", "10222254", true);
            // add the object to the list
            studentList.add(NewStudent20);
            // new students object
            students NewStudent21 = new students("Tan Wei Jun", "10204421", true);
            // add the object to the list
            studentList.add(NewStudent21);
            // new students object
            students NewStudent22 = new students("Aloysius Chin","10223380",true);
            // add the object to the list
            studentList.add(NewStudent22);
            // new students object
            students NewStudent23 =  new students("Justin Chan", "10227943", true);
            // add the object to the list
            studentList.add(NewStudent23);
            // new students object
            students NewStudent24 = new students("Queenie Ng", "10222173", true);
            // add the object to the list
            studentList.add(NewStudent24);
            // new students object
            students NewStudent25 = new students("Low Hong Wei", "10203927", true);
            // add the object to the list
            studentList.add(NewStudent25);

            // update the student to database.
            for(int b = 0; b < studentList.size(); b++) {
                db.addNewStudent(studentList.get(b));
            }
        }


        int i = 1;
        // check nameList
        for ( String name : nameList)
        {
            // initialize student
            students s = new students();
            // get the nameList and idList size.
            //s._studentId = Integer.valueOf(idList.get(randomInt(idList.size()-1)));
            //s._name = nameList.get(randomInt(nameList.size()-1));
            // add the value to studentList
            //studentList.add(s);
            //i = i + 1;
        }

        //to check if students data has initialized properly
        for ( Object student : studentList)
        {
            students s = (students) student;
            System.out.println(s.Name);
        }

        // return studentList
        return studentList;
    }
}