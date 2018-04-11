public class ActivityOneExample extends 
Activity{

    private Button playButton;

    @Override
    protected void onCreate (Bundle 
savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playButton = (Button) 
findViewById(R.id.playButtonId);

        playButton.setOnClickListener(new 
View.OnClickListener() { 
            @Override
            public void onClick(View v){
                startActivity(new 
intent(ActivityOneExample.this, 
ActivityTwoExample.class));
            }
        });
     }
}
