package p000;

import expo.modules.kotlin.jni.JNIDeallocator;
import java.lang.ref.Reference;

/* renamed from: sa0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11051sa0 extends Thread {

    /* renamed from: a */
    public final /* synthetic */ int f42485a = 1;

    /* renamed from: b */
    public final /* synthetic */ Object f42486b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11051sa0(JNIDeallocator jNIDeallocator) {
        super("Expo JNI deallocator");
        this.f42486b = jNIDeallocator;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws InterruptedException {
        switch (this.f42485a) {
            case 0:
                break;
            default:
                C1681ai c1681ai = (C1681ai) this.f42486b;
                c1681ai.getClass();
                do {
                    try {
                    } catch (InterruptedException e) {
                        throw new IllegalStateException(e);
                    }
                } while (c1681ai.m9780h());
                return;
        }
        while (!isInterrupted()) {
            try {
                Reference referenceRemove = ((JNIDeallocator) this.f42486b).f26955a.remove();
                JNIDeallocator jNIDeallocator = (JNIDeallocator) this.f42486b;
                synchronized (this) {
                }
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11051sa0(C1681ai c1681ai) {
        super("ExoPlayer:SimpleDecoder");
        this.f42486b = c1681ai;
    }
}
