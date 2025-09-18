package defpackage;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.facebook.react.bridge.ReactContext;

/* loaded from: classes.dex */
public final class NJ0 extends ClickableSpan implements LM0 {
    public final int a;

    public NJ0(int i) {
        this.a = i;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        O90.f(view, "view");
        Context context = view.getContext();
        O90.d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ReactContext reactContext = (ReactContext) context;
        int i = this.a;
        InterfaceC7405uP interfaceC7405uPB = OZ1.b(reactContext, i);
        if (interfaceC7405uPB != null) {
            interfaceC7405uPB.g(new C7098so(OZ1.d(reactContext), i, 27));
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        O90.f(textPaint, "ds");
    }
}
