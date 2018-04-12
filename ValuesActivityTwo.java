public class ValuesActivityTwo extends 
Activity{

    private TextView txtName;

    @Override
    protected void onCreate (Bundle 
savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtName = (TextView) 
findViewById(R.id.txtNameId);

        Bundle extras = 
getIntent().getExtras();

        if(extras != null){
            string name = 
extras.getString("name");
            txtName.setText(name);
        }
    }
}
