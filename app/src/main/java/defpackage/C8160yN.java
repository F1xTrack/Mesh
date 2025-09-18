package defpackage;

import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;
import androidx.emoji2.text.EmojiCompat;

/* renamed from: yN, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8160yN implements KeyListener {
    public final KeyListener a;
    public final C6518pl0 b;

    public C8160yN(KeyListener keyListener) {
        C6518pl0 c6518pl0 = new C6518pl0(13);
        this.a = keyListener;
        this.b = c6518pl0;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i) {
        this.a.clearMetaKeyState(view, editable, i);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        this.b.getClass();
        return EmojiCompat.handleOnKeyDown(editable, i, keyEvent) || this.a.onKeyDown(view, editable, i, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.a.onKeyUp(view, editable, i, keyEvent);
    }
}
