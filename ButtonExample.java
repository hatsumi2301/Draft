public class ButtonExample extends 
AppCompatActity{

    private Button playButton;
    private TextView result;

    @Override
    protected void onCreate (Bundle 
savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playButton = (Button) 
findViewById(R.id.playButtonId);
        result = (TextView) 
findViewById(R.id.resultTextViewId);

        playButton.setOnClickListener(new 
View.OnClickListener() { 
            @Override
            public void onClick(View v){
                result.setText("Texto 
alterado");
            }
        });
     }
}
