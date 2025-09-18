package p000;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.facebook.react.bridge.ReactContext;

/* loaded from: classes.dex */
public final class NJ0 extends ClickableSpan implements LM0 {

    /* renamed from: a */
    public final int f7725a;

    public NJ0(int i) {
        this.f7725a = i;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        O90.m5968f(view, "view");
        Context context = view.getContext();
        O90.m5966d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ReactContext reactContext = (ReactContext) context;
        int i = this.f7725a;
        InterfaceC6947uP interfaceC6947uPM6091b = OZ1.m6091b(reactContext, i);
        if (interfaceC6947uPM6091b != null) {
            interfaceC6947uPM6091b.mo11046g(new C6846so(OZ1.m6093d(reactContext), i, 27));
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        O90.m5968f(textPaint, "ds");
    }
}
