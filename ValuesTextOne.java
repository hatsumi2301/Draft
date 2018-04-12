public class ValuesTextOne extends 
Activity{

    private Button playButton;
    private EditText edtTxtName;

    @Override
    protected void onCreate (Bundle 
savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playButton = (Button) 
findViewById(R.id.playButtonId);
        edtTxtName = (EditText) 
findViewById(R.id.edtTxtNameId);

        playButton.setOnClickListener(new 
View.OnClickListener() { 
            @Override
            public void onClick(View v){
                string name = 
edtTxtName.getValues().toString();

                if(!name.isEmptyOrNull()){
                    Intent intent = new 
Intent(ValuesTextOne.this, 
ValuexTextTwo.class);

                    
intent.putExtras("name", name);

                     startActivity(intent);
                }
                else{
                    
Toast.makeText(getApplicationContext(), 
"por favor, informar um nome", 
Toast.LENGTH_LONG)).show();
                }
}
        });
     }
}
