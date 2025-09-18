package defpackage;

import android.widget.CompoundButton;
import com.facebook.react.bridge.ReactContext;

/* loaded from: classes.dex */
public final class RM0 implements CompoundButton.OnCheckedChangeListener {
    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        ReactContext reactContext = (ReactContext) compoundButton.getContext();
        int id = compoundButton.getId();
        OZ1.b(reactContext, id).g(new C0246Cx0(OZ1.d(reactContext), id, 1, z));
    }
}
