public class ActivityOneToast extends 
Activity{

    private Button playButton;

    @Override
    protected void onCreate (Bundle 
savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        
Toast.makeText(getApplicationContexy(), "on 
create", Toast.LENGTH_LONG)).show();

        playButton = (Button) 
findViewById(R.id.playButtonId);

        playButton.setOnClickListener(new 
View.OnClickListener() { 
            @Override
            public void onClick(View v){
                startActivity(new 
intent(ActivityOneToast.this, 
ActivityTwoToast.class));
            }
        });
     }

     @Override
     protected void onStart(){
         super.onStart();
         
Toast.makeText(getApplicationContext(), "on 
start", Toast.LENGTH_LONG)).show();
     }

    @Override
    protected void onRestar(){
        super.onRestart();

        
Toast.makeText(getApplicationContext(), "on 
restart", Toast.LENGTH_LONG)).show();
    }

    @Override
    protected void onResume(){
        super.onResume();
        
Toast.makeText(getApplicationContext(), "on 
resume", Toast.LENGTH_LONG)).show();
    }

    @Override
    protected void onPause(){
        super.onPause();
        
Toast.makeText(getApplicationContext(), 
"on pause", Toast.LENGTH_LONG)).show();
    }

    @Override
    protected void onStop(){
        super.onStop();
        
Toast.makeText(getApplicationContext(), "on 
stop", Toast.LENGTH_LONG)).show();
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        
Toast.makeText(getApplicationContext(), "on 
destroy", Toast.LENGTH_LONG)).show();
    }
}
