package p000;

import android.text.Editable;
import android.text.TextWatcher;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.views.textinput.ReactTextInputManager;

/* loaded from: classes.dex */
public final class ZM0 implements TextWatcher {

    /* renamed from: a */
    public final C9099dK0 f14865a;

    /* renamed from: b */
    public final InterfaceC6947uP f14866b;

    /* renamed from: c */
    public final int f14867c;

    /* renamed from: d */
    public String f14868d = null;

    public ZM0(S91 s91, C9099dK0 c9099dK0) {
        this.f14866b = ReactTextInputManager.getEventDispatcher(s91, c9099dK0);
        this.f14865a = c9099dK0;
        this.f14867c = OZ1.m6093d(s91);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f14868d = charSequence.toString();
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C9099dK0 c9099dK0 = this.f14865a;
        if (c9099dK0.f25953K) {
            return;
        }
        if (i3 == 0 && i2 == 0) {
            return;
        }
        UN1.m7999c(this.f14868d);
        String strSubstring = charSequence.toString().substring(i, i + i3);
        String strSubstring2 = this.f14868d.substring(i, i + i2);
        if (i3 == i2 && strSubstring.equals(strSubstring2)) {
            return;
        }
        G41 stateWrapper = c9099dK0.getStateWrapper();
        if (stateWrapper != null) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            int i4 = c9099dK0.f25960l + 1;
            c9099dK0.f25960l = i4;
            writableNativeMap.putInt("mostRecentEventCount", i4);
            writableNativeMap.putInt("opaqueCacheId", c9099dK0.getId());
            stateWrapper.updateState(writableNativeMap);
        }
        int id = c9099dK0.getId();
        String string = charSequence.toString();
        int i5 = c9099dK0.f25960l + 1;
        c9099dK0.f25960l = i5;
        UM0 um0 = new UM0(this.f14867c, id);
        um0.f11739a = string;
        um0.f11740b = i5;
        this.f14866b.mo11046g(um0);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }
}
