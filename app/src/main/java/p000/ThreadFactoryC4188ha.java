package p000;

import java.util.Locale;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ha */
/* loaded from: classes.dex */
public final class ThreadFactoryC4188ha implements ThreadFactory {

    /* renamed from: a */
    public final /* synthetic */ int f28463a;

    /* renamed from: b */
    public final AtomicInteger f28464b;

    public ThreadFactoryC4188ha(int i) {
        this.f28463a = i;
        switch (i) {
            case 1:
                this.f28464b = new AtomicInteger(0);
                break;
            case 2:
                this.f28464b = new AtomicInteger(0);
                break;
            case 3:
                this.f28464b = new AtomicInteger(0);
                break;
            default:
                this.f28464b = new AtomicInteger(0);
                break;
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f28463a) {
            case 0:
                Thread thread = new Thread(new RunnableC4125ga(runnable, 0));
                Locale locale = Locale.US;
                thread.setName("CameraX-camerax_audio_" + this.f28464b.getAndIncrement());
                return thread;
            case 1:
                Thread thread2 = new Thread(runnable);
                Locale locale2 = Locale.US;
                thread2.setName("CameraX-core_camera_" + this.f28464b.getAndIncrement());
                return thread2;
            case 2:
                Thread thread3 = new Thread(runnable);
                thread3.setName("arch_disk_io_" + this.f28464b.getAndIncrement());
                return thread3;
            default:
                Thread thread4 = new Thread(runnable);
                Locale locale3 = Locale.US;
                thread4.setName("CameraX-camerax_io_" + this.f28464b.getAndIncrement());
                return thread4;
        }
    }
}
