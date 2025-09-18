package ru.p031ok.tracer.session;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.AbstractC11374v51;
import p000.AbstractC6366lU;
import p000.AbstractC7167xu;
import p000.D51;
import p000.N61;
import p000.O90;
import ru.p031ok.tracer.base.p032io.FileUtils;
import ru.p031ok.tracer.utils.TracerFiles;
import ru.p031ok.tracer.utils.TracerThreads;

@Metadata(m22266d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\t\u0018\u0000 #2\u00020\u0001:\u0002#$B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0012\u001a\u00020\b2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rH\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000e0\u00198F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00198F¢\u0006\u0006\u001a\u0004\b!\u0010\u001f¨\u0006%"}, m22267d2 = {"Lru/ok/tracer/session/TagsStorage;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ok/tracer/session/TagsStorage$PrevTagsState;", "toPrevTagsState", "LTf1;", "ensurePrevTagsState", "(Lru/ok/tracer/session/TagsStorage$PrevTagsState;)V", "clearPrevTags", "()V", "", "", "map", "setKeys$tracer_commons_release", "(Ljava/util/Map;)V", "setKeys", "applicationContext", "Landroid/content/Context;", "lock", "Ljava/lang/Object;", "prevTagsState", "Lru/ok/tracer/session/TagsStorage$PrevTagsState;", "", "prevTagsData", "Ljava/util/List;", "", "tagsData", "getPrevTags", "()Ljava/util/List;", "prevTags", "getTags", TagsStorage.FILE_TAGS, "Companion", "PrevTagsState", "tracer-commons_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class TagsStorage {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String FILE_TAGS = "tags";
    private final Context applicationContext;
    private final Object lock;
    private List<String> prevTagsData;
    private volatile PrevTagsState prevTagsState;
    private final List<String> tagsData;

    @Metadata(m22266d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\f\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000e\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J9\u0010\u0016\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0004\b\u0015\u0010\rR\u0014\u0010\u0017\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m22267d2 = {"Lru/ok/tracer/session/TagsStorage$Companion;", "", "<init>", "()V", "", "", TagsStorage.FILE_TAGS, "rawKey", "rawValue", "", "limit", "", "addTag", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;I)Z", "removeTag", "(Ljava/util/List;Ljava/lang/String;)Z", "Ljava/io/File;", "file", "LTf1;", "deleteIfExists", "(Ljava/io/File;)V", "putTag$tracer_commons_release", "putTag", "FILE_TAGS", "Ljava/lang/String;", "tracer-commons_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean addTag(List<String> list, String rawKey, String rawValue, int limit) {
            String strM25349X = AbstractC11374v51.m25349X(31, rawKey);
            int length = strM25349X.length();
            String strM25349X2 = AbstractC11374v51.m25349X(31, rawValue);
            Iterator<String> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                if (D51.m1556o(next, strM25349X, false) && next.length() > length && next.charAt(length) == '=') {
                    it.remove();
                    if (D51.m1550i(next, strM25349X2) && next.length() == strM25349X2.length() + length + 1) {
                        list.add(next);
                        return false;
                    }
                }
            }
            list.add(strM25349X + '=' + strM25349X2);
            while (list.size() > limit) {
                list.remove(0);
            }
            return true;
        }

        public static /* synthetic */ boolean addTag$default(Companion companion, List list, String str, String str2, int i, int i2, Object obj) {
            if ((i2 & 8) != 0) {
                i = 30;
            }
            return companion.addTag(list, str, str2, i);
        }

        public final void deleteIfExists(File file) {
            if (file.exists()) {
                try {
                    FileUtils.deleteChecked(file);
                } catch (IOException unused) {
                    file.toString();
                }
            }
        }

        public static /* synthetic */ boolean putTag$tracer_commons_release$default(Companion companion, List list, String str, String str2, int i, int i2, Object obj) {
            if ((i2 & 8) != 0) {
                i = 30;
            }
            return companion.putTag$tracer_commons_release(list, str, str2, i);
        }

        private final boolean removeTag(List<String> list, String rawKey) {
            String strM25349X = AbstractC11374v51.m25349X(31, rawKey);
            int length = strM25349X.length();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (D51.m1556o(next, strM25349X, false) && next.length() > length && next.charAt(length) == '=') {
                    it.remove();
                    return true;
                }
            }
            return false;
        }

        public final boolean putTag$tracer_commons_release(List<String> list, String rawKey, String rawValue, int limit) {
            O90.m5968f(list, TagsStorage.FILE_TAGS);
            O90.m5968f(rawKey, "rawKey");
            return rawValue != null ? addTag(list, rawKey, rawValue, limit) : removeTag(list, rawKey);
        }

        private Companion() {
        }
    }

    @Metadata(m22266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m22267d2 = {"Lru/ok/tracer/session/TagsStorage$PrevTagsState;", "", "(Ljava/lang/String;I)V", "NONE", "LOADED", "CLEAN", "tracer-commons_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
    public enum PrevTagsState {
        NONE,
        LOADED,
        CLEAN
    }

    @Metadata(m22268k = 3, m22269mv = {1, 7, 1}, m22271xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PrevTagsState.values().length];
            try {
                iArr[PrevTagsState.LOADED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PrevTagsState.CLEAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PrevTagsState.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public TagsStorage(Context context) {
        O90.m5968f(context, "context");
        Context applicationContext = context.getApplicationContext();
        O90.m5967e(applicationContext, "context.applicationContext");
        this.applicationContext = applicationContext;
        this.lock = new Object();
        this.prevTagsState = PrevTagsState.NONE;
        this.tagsData = new ArrayList();
    }

    private final void ensurePrevTagsState(PrevTagsState toPrevTagsState) {
        if (this.prevTagsState.compareTo(toPrevTagsState) >= 0) {
            return;
        }
        synchronized (this.lock) {
            try {
                PrevTagsState prevTagsState = this.prevTagsState;
                if (prevTagsState.compareTo(toPrevTagsState) >= 0) {
                    return;
                }
                File fileM22437g = AbstractC6366lU.m22437g(TracerFiles.INSTANCE.getTracerDir(this.applicationContext), FILE_TAGS);
                int[] iArr = WhenMappings.$EnumSwitchMapping$0;
                int i = iArr[prevTagsState.ordinal()];
                if (i != 1) {
                    if (i != 3) {
                        throw new AssertionError("Unreachable code");
                    }
                    int i2 = iArr[toPrevTagsState.ordinal()];
                    if (i2 == 1) {
                        this.prevTagsData = TagsStorageKt.readTags(fileM22437g);
                    } else {
                        if (i2 != 2) {
                            throw new AssertionError("Unreachable code");
                        }
                        INSTANCE.deleteIfExists(fileM22437g);
                    }
                } else {
                    if (iArr[toPrevTagsState.ordinal()] != 2) {
                        throw new AssertionError("Unreachable code");
                    }
                    INSTANCE.deleteIfExists(fileM22437g);
                    this.prevTagsData = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void setKeys$lambda$4(TagsStorage tagsStorage) {
        O90.m5968f(tagsStorage, "this$0");
        tagsStorage.ensurePrevTagsState(PrevTagsState.LOADED);
        try {
            File tracerDir = TracerFiles.INSTANCE.getTracerDir(tagsStorage.applicationContext);
            FileUtils.mkdirsChecked(tracerDir);
            TagsStorageKt.writeTags(AbstractC6366lU.m22437g(tracerDir, FILE_TAGS), tagsStorage.getTags());
        } catch (Exception unused) {
        }
    }

    public final void clearPrevTags() {
        ensurePrevTagsState(PrevTagsState.CLEAN);
    }

    public final List<String> getPrevTags() {
        ensurePrevTagsState(PrevTagsState.LOADED);
        List<String> list = this.prevTagsData;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("Cannot get prev tags after clear");
    }

    public final List<String> getTags() {
        List<String> listM25982b0;
        synchronized (this.tagsData) {
            listM25982b0 = AbstractC7167xu.m25982b0(this.tagsData);
        }
        return listM25982b0;
    }

    public final void setKeys$tracer_commons_release(Map<String, String> map) {
        boolean zPutTag$tracer_commons_release;
        O90.m5968f(map, "map");
        synchronized (this.tagsData) {
            zPutTag$tracer_commons_release = false;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                zPutTag$tracer_commons_release |= INSTANCE.putTag$tracer_commons_release(this.tagsData, entry.getKey(), entry.getValue(), 30);
            }
        }
        if (zPutTag$tracer_commons_release) {
            TracerThreads.INSTANCE.runInBgSequential(new N61(4, this));
        }
    }
}
