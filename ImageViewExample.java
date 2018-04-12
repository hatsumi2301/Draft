public class MainActivity extends AppCompatActivity {
   private ImageView image;

   @Override
   protected void onCreate(Bundle 
savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);

      image = (ImageView) 
findViewById(R.id.imageId);

      
image.setImageDrawable(ContextCompat.getDrawable(this, 
R.drawable.image));
    }
}
