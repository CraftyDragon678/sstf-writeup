package com.sctf2020.vault101;

import a.b.k.e;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import b.c.a.b;

public class MainActivity extends e implements View.OnClickListener {
    public EditText p;
    public Button q;
    public AnimatedVectorDrawable r;
    public volatile b.c.a.b s;
    public ServiceConnection t = new a();

    public class a implements ServiceConnection {
        public a() {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            MainActivity.this.s = b.a.b(iBinder);
            MainActivity mainActivity = MainActivity.this;
            mainActivity.q.setOnClickListener(mainActivity);
        }

        public void onServiceDisconnected(ComponentName componentName) {
            MainActivity.this.s = null;
            MainActivity.this.q.setOnClickListener((View.OnClickListener) null);
        }
    }

    public class b implements TextWatcher {
        public b() {
        }

        public void afterTextChanged(Editable editable) {
            MainActivity.this.q.setEnabled(editable.length() > 0);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public void onClick(View view) {
        try {
            boolean a2 = this.s.a(this.p.getText().toString());
            Toast toast = new Toast(this);
            toast.setView(getLayoutInflater().inflate(a2 ? R.layout.toast_success_layout : R.layout.toast_fail_layout, (ViewGroup) findViewById(R.id.custom_toast_container)));
            toast.setGravity(17, 0, 0);
            toast.setDuration(1);
            toast.show();
            if (!a2) {
                this.p.getText().clear();
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_main);
        this.q = (Button) findViewById(R.id.button);
        EditText editText = (EditText) findViewById(R.id.editText);
        this.p = editText;
        editText.addTextChangedListener(new b());
        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) ((ImageView) findViewById(R.id.imageView)).getDrawable();
        this.r = animatedVectorDrawable;
        animatedVectorDrawable.start();
        bindService(new Intent(this, VaultService.class), this.t, 1);
    }

    public void onDestroy() {
        super.onDestroy();
        unbindService(this.t);
    }

    public void onResume() {
        super.onResume();
        this.r.start();
    }
}
