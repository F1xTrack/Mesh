package com.swmansion.reanimated.keyboard;

import java.util.Iterator;
import java.util.List;
import p000.AbstractC7341An1;
import p000.C11970zn1;
import p000.C7705Hn1;
import p000.C8433Vn1;

/* loaded from: classes2.dex */
public class KeyboardAnimationCallback extends AbstractC7341An1 {
    private static final int CONTENT_TYPE_MASK = 8;
    private final boolean mIsNavigationBarTranslucent;
    private final Keyboard mKeyboard;
    private final NotifyAboutKeyboardChangeFunction mNotifyAboutKeyboardChange;

    public KeyboardAnimationCallback(Keyboard keyboard, NotifyAboutKeyboardChangeFunction notifyAboutKeyboardChangeFunction, boolean z) {
        super(1);
        this.mNotifyAboutKeyboardChange = notifyAboutKeyboardChangeFunction;
        this.mIsNavigationBarTranslucent = z;
        this.mKeyboard = keyboard;
    }

    private static boolean isKeyboardAnimation(C7705Hn1 c7705Hn1) {
        return (c7705Hn1.f4508a.mo2780c() & CONTENT_TYPE_MASK) != 0;
    }

    @Override // p000.AbstractC7341An1
    public void onEnd(C7705Hn1 c7705Hn1) {
        if (isKeyboardAnimation(c7705Hn1)) {
            this.mKeyboard.onAnimationEnd();
            this.mNotifyAboutKeyboardChange.call();
        }
    }

    @Override // p000.AbstractC7341An1
    public C8433Vn1 onProgress(C8433Vn1 c8433Vn1, List<C7705Hn1> list) {
        Iterator<C7705Hn1> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (isKeyboardAnimation(it.next())) {
                this.mKeyboard.updateHeight(c8433Vn1, this.mIsNavigationBarTranslucent);
                this.mNotifyAboutKeyboardChange.call();
                break;
            }
        }
        return c8433Vn1;
    }

    @Override // p000.AbstractC7341An1
    public C11970zn1 onStart(C7705Hn1 c7705Hn1, C11970zn1 c11970zn1) {
        if (!isKeyboardAnimation(c7705Hn1)) {
            return c11970zn1;
        }
        this.mKeyboard.onAnimationStart();
        this.mNotifyAboutKeyboardChange.call();
        return c11970zn1;
    }
}
