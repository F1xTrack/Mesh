package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.util.SparseArray;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Promise;

/* renamed from: qL0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6631qL0 implements ActivityEventListener {
    @Override // com.facebook.react.bridge.ActivityEventListener
    public final void onActivityResult(Activity activity, int i, int i2, Intent intent) {
        if (i == 99900 && i2 == -1) {
            Uri data = intent.getData();
            SparseArray sparseArray = C7394uL0.f;
            ((Promise) sparseArray.get(99900)).resolve(data.toString());
            sparseArray.remove(99900);
        }
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public final void onNewIntent(Intent intent) {
    }
}
