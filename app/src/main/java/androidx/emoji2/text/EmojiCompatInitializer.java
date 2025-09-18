package androidx.emoji2.text;

import android.content.Context;
import android.os.Trace;
import androidx.emoji2.text.EmojiCompat;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import p000.AbstractC1526YF;
import p000.AbstractC7421Cb1;
import p000.AbstractC7538Ei0;
import p000.C10189lr0;
import p000.InterfaceC10867r80;
import p000.InterfaceC7902Li0;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements InterfaceC10867r80 {
    private static final long STARTUP_THREAD_CREATION_DELAY_MS = 500;
    private static final String S_INITIALIZER_THREAD_NAME = "EmojiCompatInitializer";

    public static class BackgroundDefaultConfig extends EmojiCompat.Config {
        public BackgroundDefaultConfig(Context context) {
            super(new BackgroundDefaultLoader(context));
            setMetadataLoadStrategy(1);
        }
    }

    public static class BackgroundDefaultLoader implements EmojiCompat.MetadataRepoLoader {
        private final Context mContext;

        public BackgroundDefaultLoader(Context context) {
            this.mContext = context.getApplicationContext();
        }

        /* renamed from: doLoad, reason: merged with bridge method [inline-methods] */
        public void lambda$load$0(final EmojiCompat.MetadataRepoLoaderCallback metadataRepoLoaderCallback, final ThreadPoolExecutor threadPoolExecutor) {
            try {
                FontRequestEmojiCompatConfig fontRequestEmojiCompatConfigCreate = DefaultEmojiCompatConfig.create(this.mContext);
                if (fontRequestEmojiCompatConfigCreate == null) {
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                }
                fontRequestEmojiCompatConfigCreate.setLoadingExecutor(threadPoolExecutor);
                fontRequestEmojiCompatConfigCreate.getMetadataRepoLoader().load(new EmojiCompat.MetadataRepoLoaderCallback() { // from class: androidx.emoji2.text.EmojiCompatInitializer.BackgroundDefaultLoader.1
                    @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback
                    public void onFailed(Throwable th) {
                        try {
                            metadataRepoLoaderCallback.onFailed(th);
                        } finally {
                            threadPoolExecutor.shutdown();
                        }
                    }

                    @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback
                    public void onLoaded(MetadataRepo metadataRepo) {
                        try {
                            metadataRepoLoaderCallback.onLoaded(metadataRepo);
                        } finally {
                            threadPoolExecutor.shutdown();
                        }
                    }
                });
            } catch (Throwable th) {
                metadataRepoLoaderCallback.onFailed(th);
                threadPoolExecutor.shutdown();
            }
        }

        @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoader
        public void load(final EmojiCompat.MetadataRepoLoaderCallback metadataRepoLoaderCallback) {
            final ThreadPoolExecutor threadPoolExecutorCreateBackgroundPriorityExecutor = ConcurrencyHelpers.createBackgroundPriorityExecutor(EmojiCompatInitializer.S_INITIALIZER_THREAD_NAME);
            threadPoolExecutorCreateBackgroundPriorityExecutor.execute(new Runnable() { // from class: androidx.emoji2.text.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f16141a.lambda$load$0(metadataRepoLoaderCallback, threadPoolExecutorCreateBackgroundPriorityExecutor);
                }
            });
        }
    }

    public static class LoadEmojiCompatRunnable implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                int i = AbstractC7421Cb1.f1471a;
                Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                if (EmojiCompat.isConfigured()) {
                    EmojiCompat.get().load();
                }
                Trace.endSection();
            } catch (Throwable th) {
                int i2 = AbstractC7421Cb1.f1471a;
                Trace.endSection();
                throw th;
            }
        }
    }

    public void delayUntilFirstResume(Context context) {
        Object objM22552J;
        C10189lr0 c10189lr0M22542P = C10189lr0.m22542P(context);
        c10189lr0M22542P.getClass();
        synchronized (C10189lr0.f37319f) {
            try {
                objM22552J = ((HashMap) c10189lr0M22542P.f37323b).get(ProcessLifecycleInitializer.class);
                if (objM22552J == null) {
                    objM22552J = c10189lr0M22542P.m22552J(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        final AbstractC7538Ei0 lifecycle = ((InterfaceC7902Li0) objM22552J).getLifecycle();
        lifecycle.mo2368a(new DefaultLifecycleObserver() { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onCreate(InterfaceC7902Li0 interfaceC7902Li0) {
                AbstractC1526YF.m9245a(this, interfaceC7902Li0);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onDestroy(InterfaceC7902Li0 interfaceC7902Li0) {
                AbstractC1526YF.m9246b(this, interfaceC7902Li0);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onPause(InterfaceC7902Li0 interfaceC7902Li0) {
                AbstractC1526YF.m9247c(this, interfaceC7902Li0);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onResume(InterfaceC7902Li0 interfaceC7902Li0) {
                EmojiCompatInitializer.this.loadEmojiCompatAfterDelay();
                lifecycle.mo2369b(this);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onStart(InterfaceC7902Li0 interfaceC7902Li0) {
                AbstractC1526YF.m9249e(this, interfaceC7902Li0);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onStop(InterfaceC7902Li0 interfaceC7902Li0) {
                AbstractC1526YF.m9250f(this, interfaceC7902Li0);
            }
        });
    }

    @Override // p000.InterfaceC10867r80
    public List<Class<? extends InterfaceC10867r80>> dependencies() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    public void loadEmojiCompatAfterDelay() {
        ConcurrencyHelpers.mainHandlerAsync().postDelayed(new LoadEmojiCompatRunnable(), STARTUP_THREAD_CREATION_DELAY_MS);
    }

    @Override // p000.InterfaceC10867r80
    public Boolean create(Context context) {
        EmojiCompat.init(new BackgroundDefaultConfig(context));
        delayUntilFirstResume(context);
        return Boolean.TRUE;
    }
}
