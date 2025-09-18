package p000;

import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;
import androidx.emoji2.text.EmojiCompat;

/* renamed from: yN */
/* loaded from: classes.dex */
public final class C7197yN implements KeyListener {

    /* renamed from: a */
    public final KeyListener f46234a;

    /* renamed from: b */
    public final C10689pl0 f46235b;

    public C7197yN(KeyListener keyListener) {
        C10689pl0 c10689pl0 = new C10689pl0(13);
        this.f46234a = keyListener;
        this.f46235b = c10689pl0;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i) {
        this.f46234a.clearMetaKeyState(view, editable, i);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f46234a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        this.f46235b.getClass();
        return EmojiCompat.handleOnKeyDown(editable, i, keyEvent) || this.f46234a.onKeyDown(view, editable, i, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f46234a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.f46234a.onKeyUp(view, editable, i, keyEvent);
    }
}
