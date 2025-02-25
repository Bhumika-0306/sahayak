<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    tools:context=".DashboardActivity">

    <TextView
        android:id="@+id/welcomeMessage"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Welcome, User!"
        android:textSize="24sp"
        android:layout_marginTop="16dp"
        android:layout_centerHorizontal="true"/>

    <ImageView
        android:id="@+id/userProfile"
        android:layout_width="100dp"
        android:layout_height="100dp"
        android:layout_below="@id/welcomeMessage"
        android:layout_centerHorizontal="true"
        android:layout_marginTop="16dp"
        android:src="@drawable/lolaa"/>

    <GridLayout
        android:id="@+id/dashboardGrid"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_below="@id/userProfile"
        android:layout_marginTop="32dp"
        android:columnCount="2"
        android:rowCount="2"
        android:padding="16dp"
        android:layout_margin="16dp">

        <!-- Emergency Contacts -->
        <androidx.cardview.widget.CardView
            android:id="@+id/cardEmergencyContacts"
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_rowWeight="1"
            android:layout_columnWeight="1"
            android:layout_margin="8dp"
            android:foreground="?attr/selectableItemBackground"
            android:onClick="openEmergencyContacts"
            app:cardCornerRadius="16dp"
            app:cardElevation="6dp">

            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                android:gravity="center"
                android:orientation="vertical"
                android:padding="16dp">

                <ImageView
                    android:layout_width="64dp"
                    android:layout_height="64dp"
                    android:src="@drawable/emergency_contacts" />

                <TextView
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_marginTop="8dp"
                    android:gravity="center"
                    android:text="Emergency Contacts"
                    android:textColor="@color/black"
                    android:textSize="16sp" />
            </LinearLayout>
        </androidx.cardview.widget.CardView>

        <!-- Volunteer Network -->
        <androidx.cardview.widget.CardView
            android:id="@+id/cardVolunteerNetwork"
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_rowWeight="1"
            android:layout_columnWeight="1"
            android:layout_margin="8dp"
            android:foreground="?attr/selectableItemBackground"
            android:onClick="openVolunteerNetwork"
            app:cardCornerRadius="16dp"
            app:cardElevation="6dp">

            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                android:gravity="center"
                android:orientation="vertical"
                android:padding="16dp">

                <ImageView
                    android:layout_width="64dp"
                    android:layout_height="64dp"
                    android:src="@drawable/volunteer" />

                <TextView
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_marginTop="8dp"
                    android:gravity="center"
                    android:text="Volunteer Network"
                    android:textColor="@color/black"
                    android:textSize="16sp" />
            </LinearLayout>
        </androidx.cardview.widget.CardView>

        <!-- Community Board -->
        <androidx.cardview.widget.CardView
            android:id="@+id/cardCommunityBoard"
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_rowWeight="1"
            android:layout_columnWeight="1"
            android:layout_margin="8dp"
            android:foreground="?attr/selectableItemBackground"
            android:onClick="openCommunityBoard"
            app:cardCornerRadius="16dp"
            app:cardElevation="6dp">

            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                android:gravity="center"
                android:orientation="vertical"
                android:padding="16dp">

                <ImageView
                    android:layout_width="64dp"
                    android:layout_height="64dp"
                    android:src="@drawable/community" />

                <TextView
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_marginTop="8dp"
                    android:gravity="center"
                    android:text="Community Board"
                    android:textColor="@color/black"
                    android:textSize="16sp" />
            </LinearLayout>
        </androidx.cardview.widget.CardView>

        <!-- Weather & Traffic -->
        <androidx.cardview.widget.CardView
            android:id="@+id/cardWeatherTraffic"
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_rowWeight="1"
            android:layout_columnWeight="1"
            android:layout_margin="8dp"
            android:foreground="?attr/selectableItemBackground"
            android:onClick="openWeatherTraffic"
            app:cardCornerRadius="16dp"
            app:cardElevation="6dp">

            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                android:gravity="center"
                android:orientation="vertical"
                android:padding="16dp">

                <ImageView
                    android:layout_width="64dp"
                    android:layout_height="64dp"
                    android:src="@drawable/weather_traffic" />

                <TextView
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_marginTop="8dp"
                    android:gravity="center"
                    android:text="Weather and Traffic"
                    android:textColor="@color/black"
                    android:textSize="16sp" />
            </LinearLayout>
        </androidx.cardview.widget.CardView>

    </GridLayout>


    <Button
        android:id="@+id/btnLogout"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignParentBottom="true"
        android:layout_centerHorizontal="true"
        android:layout_marginBottom="16dp"
        android:text="Logout"
        android:textSize="20sp" />
</RelativeLayout>

package com.example.sahayak_bhumika;



import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class DashboardActivity extends AppCompatActivity {

    private TextView welcomeMessage;
    private ImageView userProfile;
    private CardView cardEmergencyContacts, cardVolunteerNetwork, cardCommunityBoard, cardWeatherTraffic;
    private Button btnLogout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);  // Ensure this XML filename matches your XML file

        // Initialize UI Components
        welcomeMessage = findViewById(R.id.welcomeMessage);
        userProfile = findViewById(R.id.userProfile);
        cardEmergencyContacts = findViewById(R.id.dashboardGrid).findViewById(R.id.openEmergencyContacts);
        cardVolunteerNetwork = findViewById(R.id.dashboardGrid).findViewById(R.id.openVolunteerNetwork);
        cardCommunityBoard = findViewById(R.id.dashboardGrid).findViewById(R.id.openCommunityBoard);
        cardWeatherTraffic = findViewById(R.id.dashboardGrid).findViewById(R.id.openWeatherTraffic);
        btnLogout = findViewById(R.id.btnLogout);

        // Set Welcome Message (Dynamic if using user session)
        String userName = "User";  // Replace this with dynamic user name if available
        welcomeMessage.setText("Welcome, " + userName + "!");

        // Set Profile Image (Ensure the drawable resource exists)
        userProfile.setImageResource(R.drawable.lolaa);

        // Click Listeners for Dashboard Cards
        cardEmergencyContacts.setOnClickListener(v -> openActivity(EmergencyActivity.class));
        cardVolunteerNetwork.setOnClickListener(v -> openActivity(VolunteerNetworkActivity.class));
        cardCommunityBoard.setOnClickListener(v -> openActivity(CommunityBoardActivity.class));
        cardWeatherTraffic.setOnClickListener(v -> openActivity(WeatherTrafficActivity.class));

        // Logout Button Click Listener
        btnLogout.setOnClickListener(v -> logoutUser());
    }

    // Function to Open Activities
    private void openActivity(Class<?> activityClass) {
        Intent intent = new Intent(DashboardActivity.this, activityClass);
        startActivity(intent);
    }

    // Logout Functionality
    private void logoutUser() {
        // TODO: Clear user session if implemented (SharedPreferences, FirebaseAuth, etc.)
        Intent intent = new Intent(DashboardActivity.this, LoginActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK); // Clears activity stack
        startActivity(intent);
        finish();
    }
}
