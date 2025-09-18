package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.views.textinput.ReactTextInputManager;

/* loaded from: classes.dex */
public final class ZM0 implements TextWatcher {
    public final C3370dK0 a;
    public final InterfaceC7405uP b;
    public final int c;
    public String d = null;

    public ZM0(S91 s91, C3370dK0 c3370dK0) {
        this.b = ReactTextInputManager.getEventDispatcher(s91, c3370dK0);
        this.a = c3370dK0;
        this.c = OZ1.d(s91);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.d = charSequence.toString();
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C3370dK0 c3370dK0 = this.a;
        if (c3370dK0.K) {
            return;
        }
        if (i3 == 0 && i2 == 0) {
            return;
        }
        UN1.c(this.d);
        String strSubstring = charSequence.toString().substring(i, i + i3);
        String strSubstring2 = this.d.substring(i, i + i2);
        if (i3 == i2 && strSubstring.equals(strSubstring2)) {
            return;
        }
        G41 stateWrapper = c3370dK0.getStateWrapper();
        if (stateWrapper != null) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            int i4 = c3370dK0.l + 1;
            c3370dK0.l = i4;
            writableNativeMap.putInt("mostRecentEventCount", i4);
            writableNativeMap.putInt("opaqueCacheId", c3370dK0.getId());
            stateWrapper.updateState(writableNativeMap);
        }
        int id = c3370dK0.getId();
        String string = charSequence.toString();
        int i5 = c3370dK0.l + 1;
        c3370dK0.l = i5;
        UM0 um0 = new UM0(this.c, id);
        um0.a = string;
        um0.b = i5;
        this.b.g(um0);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }
}
