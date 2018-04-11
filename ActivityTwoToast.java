public class ActivityTwoToast extends 
Activity{

    private Button playButton;

    @Override
    protected void onCreate (Bundle 
savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playButton = (Button) 
findViewById(R.id.playButtonId);

        playButton.setOnClickListenet(new 
View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new 
intent(ActivityTwoToast.this, 
ActivityOneToast.class));
            }
        }
     }
