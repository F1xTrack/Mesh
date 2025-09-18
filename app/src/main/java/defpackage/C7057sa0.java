package defpackage;

import expo.modules.kotlin.jni.JNIDeallocator;
import java.lang.ref.Reference;

/* renamed from: sa0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7057sa0 extends Thread {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7057sa0(JNIDeallocator jNIDeallocator) {
        super("Expo JNI deallocator");
        this.b = jNIDeallocator;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws InterruptedException {
        switch (this.a) {
            case 0:
                break;
            default:
                C2184ai c2184ai = (C2184ai) this.b;
                c2184ai.getClass();
                do {
                    try {
                    } catch (InterruptedException e) {
                        throw new IllegalStateException(e);
                    }
                } while (c2184ai.h());
                return;
        }
        while (!isInterrupted()) {
            try {
                Reference referenceRemove = ((JNIDeallocator) this.b).a.remove();
                JNIDeallocator jNIDeallocator = (JNIDeallocator) this.b;
                synchronized (this) {
                }
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7057sa0(C2184ai c2184ai) {
        super("ExoPlayer:SimpleDecoder");
        this.b = c2184ai;
    }
}
