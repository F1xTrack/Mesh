package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import androidx.emoji2.text.EmojiCompat;
import java.nio.MappedByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import p000.AbstractC1374Vq;
import p000.AbstractC7421Cb1;
import p000.AbstractC7843Ke1;
import p000.AbstractC8041Nz1;
import p000.AbstractC9104dM1;
import p000.C1791bX;
import p000.C6306kX;
import p000.C6369lX;
import p000.HZ1;

/* loaded from: classes.dex */
public class FontRequestEmojiCompatConfig extends EmojiCompat.Config {
    private static final FontProviderHelper DEFAULT_FONTS_CONTRACT = new FontProviderHelper();

    public static class ExponentialBackoffRetryPolicy extends RetryPolicy {
        private long mRetryOrigin;
        private final long mTotalMs;

        public ExponentialBackoffRetryPolicy(long j) {
            this.mTotalMs = j;
        }

        @Override // androidx.emoji2.text.FontRequestEmojiCompatConfig.RetryPolicy
        public long getRetryDelay() {
            if (this.mRetryOrigin == 0) {
                this.mRetryOrigin = SystemClock.uptimeMillis();
                return 0L;
            }
            long jUptimeMillis = SystemClock.uptimeMillis() - this.mRetryOrigin;
            if (jUptimeMillis > this.mTotalMs) {
                return -1L;
            }
            return Math.min(Math.max(jUptimeMillis, 1000L), this.mTotalMs - jUptimeMillis);
        }
    }

    public static class FontProviderHelper {
        public Typeface buildTypeface(Context context, C6369lX c6369lX) throws PackageManager.NameNotFoundException {
            return AbstractC7843Ke1.f6246a.mo3090c(context, new C6369lX[]{c6369lX}, 0);
        }

        public C6306kX fetchFonts(Context context, C1791bX c1791bX) throws PackageManager.NameNotFoundException {
            return AbstractC8041Nz1.m5916a(context, c1791bX);
        }

        public void registerObserver(Context context, Uri uri, ContentObserver contentObserver) {
            context.getContentResolver().registerContentObserver(uri, false, contentObserver);
        }

        public void unregisterObserver(Context context, ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    public static class FontRequestMetadataLoader implements EmojiCompat.MetadataRepoLoader {
        private static final String S_TRACE_BUILD_TYPEFACE = "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface";
        EmojiCompat.MetadataRepoLoaderCallback mCallback;
        private final Context mContext;
        private Executor mExecutor;
        private final FontProviderHelper mFontProviderHelper;
        private final Object mLock = new Object();
        private Handler mMainHandler;
        private Runnable mMainHandlerLoadCallback;
        private ThreadPoolExecutor mMyThreadPoolExecutor;
        private ContentObserver mObserver;
        private final C1791bX mRequest;
        private RetryPolicy mRetryPolicy;

        public FontRequestMetadataLoader(Context context, C1791bX c1791bX, FontProviderHelper fontProviderHelper) {
            AbstractC9104dM1.m17549h(context, "Context cannot be null");
            AbstractC9104dM1.m17549h(c1791bX, "FontRequest cannot be null");
            this.mContext = context.getApplicationContext();
            this.mRequest = c1791bX;
            this.mFontProviderHelper = fontProviderHelper;
        }

        private void cleanUp() {
            synchronized (this.mLock) {
                try {
                    this.mCallback = null;
                    ContentObserver contentObserver = this.mObserver;
                    if (contentObserver != null) {
                        this.mFontProviderHelper.unregisterObserver(this.mContext, contentObserver);
                        this.mObserver = null;
                    }
                    Handler handler = this.mMainHandler;
                    if (handler != null) {
                        handler.removeCallbacks(this.mMainHandlerLoadCallback);
                    }
                    this.mMainHandler = null;
                    ThreadPoolExecutor threadPoolExecutor = this.mMyThreadPoolExecutor;
                    if (threadPoolExecutor != null) {
                        threadPoolExecutor.shutdown();
                    }
                    this.mExecutor = null;
                    this.mMyThreadPoolExecutor = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        private C6369lX retrieveFontInfo() {
            try {
                C6306kX c6306kXFetchFonts = this.mFontProviderHelper.fetchFonts(this.mContext, this.mRequest);
                if (c6306kXFetchFonts.f36523a != 0) {
                    throw new RuntimeException(AbstractC1374Vq.m8591j(new StringBuilder("fetchFonts failed ("), c6306kXFetchFonts.f36523a, ")"));
                }
                C6369lX[] c6369lXArr = c6306kXFetchFonts.f36524b;
                if (c6369lXArr == null || c6369lXArr.length == 0) {
                    throw new RuntimeException("fetchFonts failed (empty result)");
                }
                return c6369lXArr[0];
            } catch (PackageManager.NameNotFoundException e) {
                throw new RuntimeException("provider not found", e);
            }
        }

        private void scheduleRetry(Uri uri, long j) {
            synchronized (this.mLock) {
                try {
                    Handler handlerMainHandlerAsync = this.mMainHandler;
                    if (handlerMainHandlerAsync == null) {
                        handlerMainHandlerAsync = ConcurrencyHelpers.mainHandlerAsync();
                        this.mMainHandler = handlerMainHandlerAsync;
                    }
                    if (this.mObserver == null) {
                        ContentObserver contentObserver = new ContentObserver(handlerMainHandlerAsync) { // from class: androidx.emoji2.text.FontRequestEmojiCompatConfig.FontRequestMetadataLoader.1
                            @Override // android.database.ContentObserver
                            public void onChange(boolean z, Uri uri2) {
                                FontRequestMetadataLoader.this.loadInternal();
                            }
                        };
                        this.mObserver = contentObserver;
                        this.mFontProviderHelper.registerObserver(this.mContext, uri, contentObserver);
                    }
                    if (this.mMainHandlerLoadCallback == null) {
                        this.mMainHandlerLoadCallback = new RunnableC1715c(this, 1);
                    }
                    handlerMainHandlerAsync.postDelayed(this.mMainHandlerLoadCallback, j);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void createMetadata() {
            synchronized (this.mLock) {
                try {
                    if (this.mCallback == null) {
                        return;
                    }
                    try {
                        C6369lX c6369lXRetrieveFontInfo = retrieveFontInfo();
                        int i = c6369lXRetrieveFontInfo.f37097e;
                        if (i == 2) {
                            synchronized (this.mLock) {
                                try {
                                    RetryPolicy retryPolicy = this.mRetryPolicy;
                                    if (retryPolicy != null) {
                                        long retryDelay = retryPolicy.getRetryDelay();
                                        if (retryDelay >= 0) {
                                            scheduleRetry(c6369lXRetrieveFontInfo.f37093a, retryDelay);
                                            return;
                                        }
                                    }
                                } finally {
                                }
                            }
                        }
                        if (i != 0) {
                            throw new RuntimeException("fetchFonts result is not OK. (" + i + ")");
                        }
                        try {
                            int i2 = AbstractC7421Cb1.f1471a;
                            Trace.beginSection(S_TRACE_BUILD_TYPEFACE);
                            Typeface typefaceBuildTypeface = this.mFontProviderHelper.buildTypeface(this.mContext, c6369lXRetrieveFontInfo);
                            MappedByteBuffer mappedByteBufferM3510f = HZ1.m3510f(this.mContext, c6369lXRetrieveFontInfo.f37093a);
                            if (mappedByteBufferM3510f == null || typefaceBuildTypeface == null) {
                                throw new RuntimeException("Unable to open file.");
                            }
                            MetadataRepo metadataRepoCreate = MetadataRepo.create(typefaceBuildTypeface, mappedByteBufferM3510f);
                            Trace.endSection();
                            synchronized (this.mLock) {
                                try {
                                    EmojiCompat.MetadataRepoLoaderCallback metadataRepoLoaderCallback = this.mCallback;
                                    if (metadataRepoLoaderCallback != null) {
                                        metadataRepoLoaderCallback.onLoaded(metadataRepoCreate);
                                    }
                                } finally {
                                }
                            }
                            cleanUp();
                        } catch (Throwable th) {
                            int i3 = AbstractC7421Cb1.f1471a;
                            Trace.endSection();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        synchronized (this.mLock) {
                            try {
                                EmojiCompat.MetadataRepoLoaderCallback metadataRepoLoaderCallback2 = this.mCallback;
                                if (metadataRepoLoaderCallback2 != null) {
                                    metadataRepoLoaderCallback2.onFailed(th2);
                                }
                                cleanUp();
                            } finally {
                            }
                        }
                    }
                } finally {
                }
            }
        }

        @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoader
        public void load(EmojiCompat.MetadataRepoLoaderCallback metadataRepoLoaderCallback) {
            AbstractC9104dM1.m17549h(metadataRepoLoaderCallback, "LoaderCallback cannot be null");
            synchronized (this.mLock) {
                this.mCallback = metadataRepoLoaderCallback;
            }
            loadInternal();
        }

        public void loadInternal() {
            synchronized (this.mLock) {
                try {
                    if (this.mCallback == null) {
                        return;
                    }
                    if (this.mExecutor == null) {
                        ThreadPoolExecutor threadPoolExecutorCreateBackgroundPriorityExecutor = ConcurrencyHelpers.createBackgroundPriorityExecutor("emojiCompat");
                        this.mMyThreadPoolExecutor = threadPoolExecutorCreateBackgroundPriorityExecutor;
                        this.mExecutor = threadPoolExecutorCreateBackgroundPriorityExecutor;
                    }
                    this.mExecutor.execute(new RunnableC1715c(this, 0));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void setExecutor(Executor executor) {
            synchronized (this.mLock) {
                this.mExecutor = executor;
            }
        }

        public void setRetryPolicy(RetryPolicy retryPolicy) {
            synchronized (this.mLock) {
                this.mRetryPolicy = retryPolicy;
            }
        }
    }

    public static abstract class RetryPolicy {
        public abstract long getRetryDelay();
    }

    public FontRequestEmojiCompatConfig(Context context, C1791bX c1791bX) {
        super(new FontRequestMetadataLoader(context, c1791bX, DEFAULT_FONTS_CONTRACT));
    }

    @Deprecated
    public FontRequestEmojiCompatConfig setHandler(Handler handler) {
        if (handler == null) {
            return this;
        }
        setLoadingExecutor(ConcurrencyHelpers.convertHandlerToExecutor(handler));
        return this;
    }

    public FontRequestEmojiCompatConfig setLoadingExecutor(Executor executor) {
        ((FontRequestMetadataLoader) getMetadataRepoLoader()).setExecutor(executor);
        return this;
    }

    public FontRequestEmojiCompatConfig setRetryPolicy(RetryPolicy retryPolicy) {
        ((FontRequestMetadataLoader) getMetadataRepoLoader()).setRetryPolicy(retryPolicy);
        return this;
    }

    public FontRequestEmojiCompatConfig(Context context, C1791bX c1791bX, FontProviderHelper fontProviderHelper) {
        super(new FontRequestMetadataLoader(context, c1791bX, fontProviderHelper));
    }
}
