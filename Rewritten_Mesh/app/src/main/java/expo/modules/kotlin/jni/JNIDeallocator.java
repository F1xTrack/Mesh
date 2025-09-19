package expo.modules.kotlin.jni;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import p000.C11051sa0;
import p000.O90;

@Metadata(m22266d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m22267d2 = {"Lexpo/modules/kotlin/jni/JNIDeallocator;", "", "Lexpo/modules/kotlin/jni/Destructible;", "destructible", "LTf1;", "addReference", "(Lexpo/modules/kotlin/jni/Destructible;)V", "expo-modules-core_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class JNIDeallocator {

    /* renamed from: a */
    public final ReferenceQueue f26955a;

    /* renamed from: b */
    public final LinkedHashMap f26956b;

    /* renamed from: c */
    public final C11051sa0 f26957c;

    public JNIDeallocator() {
        this(0);
    }

    /* renamed from: a */
    public final void m18091a() {
        synchronized (this) {
            try {
                Iterator it = this.f26956b.values().iterator();
                while (it.hasNext()) {
                    Destructible destructible = (Destructible) ((WeakReference) it.next()).get();
                    if (destructible != null) {
                        destructible.mo18089a();
                    }
                }
                this.f26956b.clear();
                C11051sa0 c11051sa0 = this.f26957c;
                if (c11051sa0 != null) {
                    c11051sa0.interrupt();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void addReference(Destructible destructible) {
        O90.m5968f(destructible, "destructible");
        synchronized (this) {
            WeakReference weakReference = new WeakReference(destructible);
            this.f26956b.put(new PhantomReference(destructible, this.f26955a), weakReference);
        }
    }

    public JNIDeallocator(int i) {
        this.f26955a = new ReferenceQueue();
        this.f26956b = new LinkedHashMap();
        C11051sa0 c11051sa0 = new C11051sa0(this);
        c11051sa0.start();
        this.f26957c = c11051sa0;
    }
}
