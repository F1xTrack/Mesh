package com.swmansion.reanimated.keyboard;

import p000.AbstractC11406vL1;
import p000.C8433Vn1;

/* loaded from: classes2.dex */
public class Keyboard {
    private static final int CONTENT_TYPE_MASK = 8;
    private static final int SYSTEM_BAR_TYPE_MASK = 7;
    private KeyboardState mState = KeyboardState.UNKNOWN;
    private int mHeight = 0;
    private int mActiveTransitionCounter = 0;

    public int getHeight() {
        return this.mHeight;
    }

    public KeyboardState getState() {
        return this.mState;
    }

    public void onAnimationEnd() {
        int i = this.mActiveTransitionCounter - 1;
        this.mActiveTransitionCounter = i;
        if (i == 0) {
            this.mState = this.mHeight <= 0 ? KeyboardState.CLOSED : KeyboardState.OPEN;
        }
    }

    public void onAnimationStart() {
        int i = this.mActiveTransitionCounter;
        if (i > 0) {
            KeyboardState keyboardState = this.mState;
            KeyboardState keyboardState2 = KeyboardState.OPENING;
            if (keyboardState == keyboardState2) {
                keyboardState2 = KeyboardState.CLOSING;
            }
            this.mState = keyboardState2;
        } else {
            this.mState = this.mHeight <= 0 ? KeyboardState.OPENING : KeyboardState.CLOSING;
        }
        this.mActiveTransitionCounter = i + 1;
    }

    public void updateHeight(C8433Vn1 c8433Vn1, boolean z) {
        int i;
        int i2 = c8433Vn1.f12756a.mo5837f(CONTENT_TYPE_MASK).f5355d;
        if (z) {
            i = 0;
        } else {
            i = c8433Vn1.f12756a.mo5837f(SYSTEM_BAR_TYPE_MASK).f5355d;
        }
        int iM25402a = (int) AbstractC11406vL1.m25402a(Math.max(0, i2 - i));
        if (iM25402a > 0 || this.mState != KeyboardState.OPEN) {
            this.mHeight = iM25402a;
        }
    }
}
