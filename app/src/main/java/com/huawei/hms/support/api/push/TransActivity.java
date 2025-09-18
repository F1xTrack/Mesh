package com.huawei.hms.support.api.push;

import android.app.Activity;
import android.os.Bundle;
import com.huawei.hms.push.C2234t;
import ru.mes.dnevnik.R;

/* loaded from: classes2.dex */
public class TransActivity extends Activity {
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.hwpush_trans_activity);
        getWindow().addFlags(67108864);
        C2234t.m12522a(this, getIntent());
        finish();
    }
}
