package p000;

import android.widget.CompoundButton;
import com.facebook.react.bridge.ReactContext;

/* loaded from: classes.dex */
public final class RM0 implements CompoundButton.OnCheckedChangeListener {
    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        ReactContext reactContext = (ReactContext) compoundButton.getContext();
        int id = compoundButton.getId();
        OZ1.m6091b(reactContext, id).mo11046g(new C7464Cx0(OZ1.m6093d(reactContext), id, 1, z));
    }
}
