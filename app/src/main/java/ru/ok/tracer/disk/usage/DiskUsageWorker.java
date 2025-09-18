package ru.ok.tracer.disk.usage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import defpackage.AbstractC1061Nj0;
import defpackage.AbstractC1705Vq;
import defpackage.AbstractC5702lU;
import defpackage.AbstractC7287tn0;
import defpackage.AbstractC8069xu;
import defpackage.AbstractC8449zu;
import defpackage.C0828Kj0;
import defpackage.D51;
import defpackage.F91;
import defpackage.GT1;
import defpackage.LB;
import defpackage.MN;
import defpackage.NN;
import defpackage.O90;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.tracer.disk.usage.DiskUsageWorker;
import ru.ok.tracer.upload.SampleUploader;
import ru.ok.tracer.utils.KtxExtensionsKt;
import ru.ok.tracer.utils.Logger;
import ru.ok.tracer.utils.TracerFiles;
import ru.ok.tracer.utils.config.ConfigStorage;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 .2\u00020\u0001:\u0002./B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u000f\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0013J5\u0010\u0018\u001a\u00020\u00172\b\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0015\u001a\u00020\t2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J-\u0010 \u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0019\u0010#\u001a\u00020\"2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'R\u001b\u0010-\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u00060"}, d2 = {"Lru/ok/tracer/disk/usage/DiskUsageWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "", "Lru/ok/tracer/disk/usage/GlobalDirs;", "Lru/ok/tracer/disk/usage/DiskUsageWorker$SpaceConsumer;", "consumersDirs", "", "total", "", "toJson", "(Ljava/util/Map;J)Ljava/lang/String;", "consumer", "Lorg/json/JSONObject;", "(Lru/ok/tracer/disk/usage/DiskUsageWorker$SpaceConsumer;)Lorg/json/JSONObject;", "dir", "globalDir", "out", "LTf1;", "topConsumers", "(Ljava/lang/String;Lru/ok/tracer/disk/usage/GlobalDirs;Ljava/util/Map;)V", "Ljava/io/File;", "file", "", "depth", "", "excludedPath", "walkTree", "(Ljava/io/File;ILjava/util/List;)Lru/ok/tracer/disk/usage/DiskUsageWorker$SpaceConsumer;", "", "isSymlink", "(Ljava/io/File;)Z", "LNj0;", "doWork", "()LNj0;", "Lru/ok/tracer/disk/usage/DiskUsageConfiguration;", "config$delegate", "Lkotlin/Lazy;", "getConfig", "()Lru/ok/tracer/disk/usage/DiskUsageConfiguration;", "config", "Companion", "SpaceConsumer", "tracer-disk-usage_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class DiskUsageWorker extends Worker {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    private static final int MAX_DEPTH = 6;

    @Deprecated
    private static final int MAX_ENTRIES = 20;

    /* renamed from: config$delegate, reason: from kotlin metadata */
    private final Lazy config;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ok/tracer/disk/usage/DiskUsageWorker$Companion;", "", "()V", "MAX_DEPTH", "", "MAX_ENTRIES", "tracer-disk-usage_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiskUsageWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        O90.f(context, "context");
        O90.f(workerParameters, "workerParameters");
        this.config = LB.b(DiskUsageWorker$config$2.INSTANCE);
    }

    private final DiskUsageConfiguration getConfig() {
        return (DiskUsageConfiguration) this.config.getValue();
    }

    private final boolean isSymlink(File file) {
        try {
            if (file == null) {
                throw new NullPointerException("File must not be null");
            }
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                file = new File(parentFile.getCanonicalFile(), file.getName());
            }
            return !O90.a(file.getCanonicalFile(), file.getAbsoluteFile());
        } catch (IOException unused) {
            return false;
        }
    }

    private final String toJson(Map<GlobalDirs, SpaceConsumer> consumersDirs, long total) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        Iterator<T> it = consumersDirs.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            jSONObject2.put(((GlobalDirs) entry.getKey()).getTag(), toJson((SpaceConsumer) entry.getValue()));
        }
        jSONObject.put("consumers", jSONObject2);
        jSONObject.put("total_size", total);
        String string = jSONObject.toString();
        O90.e(string, "jsonObject.toString()");
        return string;
    }

    private final void topConsumers(String dir, GlobalDirs globalDir, Map<GlobalDirs, SpaceConsumer> out) throws IOException {
        if (dir == null) {
            return;
        }
        String tag = globalDir.getTag();
        File file = new File(dir);
        List<String> excludedPaths = getConfig().getExcludedPaths();
        ArrayList arrayList = new ArrayList();
        for (Object obj : excludedPaths) {
            if (D51.o((String) obj, tag + ':', false)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC8449zu.k(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String strSubstring = ((String) it.next()).substring(tag.length() + 1);
            O90.e(strSubstring, "this as java.lang.String).substring(startIndex)");
            arrayList2.add(AbstractC5702lU.g(file, strSubstring));
        }
        out.put(globalDir, walkTree(file, 0, arrayList2));
    }

    private final SpaceConsumer walkTree(File file, int depth, List<? extends File> excludedPath) {
        List arrayList;
        boolean z;
        boolean z2;
        List listSubList;
        if (excludedPath.contains(file)) {
            Logger.d$default("File excluded " + file, null, 2, null);
            String name = file.getName();
            O90.e(name, "file.name");
            return new SpaceConsumer(0L, name, false, null, false, true, 28, null);
        }
        if (!file.isDirectory()) {
            long length = file.length();
            String name2 = file.getName();
            O90.e(name2, "file.name");
            return new SpaceConsumer(length, name2, false, null, false, false, 60, null);
        }
        if (isSymlink(file)) {
            String name3 = file.getName();
            O90.e(name3, "file.name");
            return new SpaceConsumer(0L, name3, true, null, false, false, 56, null);
        }
        File[] fileArrListFiles = file.listFiles();
        List list = MN.a;
        if (fileArrListFiles != null) {
            arrayList = new ArrayList(fileArrListFiles.length);
            for (File file2 : fileArrListFiles) {
                O90.e(file2, "it");
                arrayList.add(walkTree(file2, depth + 1, excludedPath));
            }
        } else {
            arrayList = list;
        }
        long j = 4096;
        Iterator it = arrayList.iterator();
        long size = 0;
        while (it.hasNext()) {
            size += ((SpaceConsumer) it.next()).getSize();
        }
        long j2 = j + size;
        if (depth > 6) {
            Logger.d$default("Max depth reached for " + file, null, 2, null);
            z = true;
        } else {
            z = false;
            list = arrayList;
        }
        List listW = AbstractC8069xu.W(list, new Comparator() { // from class: ru.ok.tracer.disk.usage.DiskUsageWorker$walkTree$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return GT1.b(Long.valueOf(((DiskUsageWorker.SpaceConsumer) t2).getSize()), Long.valueOf(((DiskUsageWorker.SpaceConsumer) t).getSize()));
            }
        });
        if (listW.size() > 20) {
            Logger.d$default("Max children reached for " + file, null, 2, null);
            listSubList = listW.subList(0, 20);
            z2 = true;
        } else {
            z2 = z;
            listSubList = listW;
        }
        String name4 = file.getName();
        O90.e(name4, "file.name");
        return new SpaceConsumer(j2, name4, true, listSubList, z2, false, 32, null);
    }

    @Override // androidx.work.Worker
    public AbstractC1061Nj0 doWork() {
        File parentFile;
        if (ConfigStorage.isLimited$default(ConfigStorage.INSTANCE, FEATURE_DISK_USAGEKt.getFEATURE_DISK_USAGE(), null, 2, null)) {
            Logger.d$default("Skip. Limited", null, 2, null);
            return AbstractC1061Nj0.a();
        }
        if (!KtxExtensionsKt.testProbability(Long.valueOf(getConfig().getProbability()))) {
            Logger.d$default("Skip. Probability", null, 2, null);
            return AbstractC1061Nj0.a();
        }
        Logger.d$default("Collecting disk usage stats", null, 2, null);
        Context applicationContext = getApplicationContext();
        O90.e(applicationContext, "applicationContext");
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            topConsumers(applicationInfo.dataDir, GlobalDirs.INTERNAL_DATA, linkedHashMap);
            File externalFilesDir = applicationContext.getExternalFilesDir(null);
            topConsumers((externalFilesDir == null || (parentFile = externalFilesDir.getParentFile()) == null) ? null : parentFile.getPath(), GlobalDirs.EXTERNAL_DATA, linkedHashMap);
            File parentFile2 = new File(applicationInfo.sourceDir).getParentFile();
            topConsumers(parentFile2 != null ? parentFile2.getPath() : null, GlobalDirs.SRC, linkedHashMap);
            Iterator it = linkedHashMap.values().iterator();
            long size = 0;
            while (it.hasNext()) {
                size += ((SpaceConsumer) it.next()).getSize();
            }
            long interestingSizeBytes = getConfig().getInterestingSizeBytes();
            if (size > interestingSizeBytes) {
                TracerFiles tracerFiles = TracerFiles.INSTANCE;
                Context applicationContext2 = getApplicationContext();
                O90.e(applicationContext2, "applicationContext");
                File newSampleFile$default = TracerFiles.getNewSampleFile$default(tracerFiles, applicationContext2, FEATURE_DISK_USAGEKt.getFEATURE_DISK_USAGE(), null, 4, null);
                String json = toJson(linkedHashMap, size);
                Logger.d$default(json, null, 2, null);
                AbstractC5702lU.h(newSampleFile$default, json);
                SampleUploader sampleUploader = SampleUploader.INSTANCE;
                Context applicationContext3 = getApplicationContext();
                O90.e(applicationContext3, "applicationContext");
                sampleUploader.upload(applicationContext3, FEATURE_DISK_USAGEKt.getFEATURE_DISK_USAGE(), newSampleFile$default, (72 & 8) != 0, (72 & 16) != 0 ? null : null, (72 & 32) != 0 ? null : Long.valueOf(size), (72 & 64) != 0 ? NN.a : AbstractC7287tn0.c(new Pair("limit", String.valueOf(interestingSizeBytes))));
            }
            return AbstractC1061Nj0.a();
        } catch (Exception unused) {
            return new C0828Kj0();
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007¢\u0006\u0002\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00000\tHÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003JK\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lru/ok/tracer/disk/usage/DiskUsageWorker$SpaceConsumer;", "", "size", "", "name", "", "isDirectory", "", "children", "", "overflow", "excluded", "(JLjava/lang/String;ZLjava/util/List;ZZ)V", "getChildren", "()Ljava/util/List;", "getExcluded", "()Z", "getName", "()Ljava/lang/String;", "getOverflow", "getSize", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "tracer-disk-usage_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class SpaceConsumer {
        private final List<SpaceConsumer> children;
        private final boolean excluded;
        private final boolean isDirectory;
        private final String name;
        private final boolean overflow;
        private final long size;

        public SpaceConsumer(long j, String str, boolean z, List<SpaceConsumer> list, boolean z2, boolean z3) {
            O90.f(str, "name");
            O90.f(list, "children");
            this.size = j;
            this.name = str;
            this.isDirectory = z;
            this.children = list;
            this.overflow = z2;
            this.excluded = z3;
        }

        /* renamed from: component1, reason: from getter */
        public final long getSize() {
            return this.size;
        }

        /* renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsDirectory() {
            return this.isDirectory;
        }

        public final List<SpaceConsumer> component4() {
            return this.children;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getOverflow() {
            return this.overflow;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getExcluded() {
            return this.excluded;
        }

        public final SpaceConsumer copy(long size, String name, boolean isDirectory, List<SpaceConsumer> children, boolean overflow, boolean excluded) {
            O90.f(name, "name");
            O90.f(children, "children");
            return new SpaceConsumer(size, name, isDirectory, children, overflow, excluded);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SpaceConsumer)) {
                return false;
            }
            SpaceConsumer spaceConsumer = (SpaceConsumer) other;
            return this.size == spaceConsumer.size && O90.a(this.name, spaceConsumer.name) && this.isDirectory == spaceConsumer.isDirectory && O90.a(this.children, spaceConsumer.children) && this.overflow == spaceConsumer.overflow && this.excluded == spaceConsumer.excluded;
        }

        public final List<SpaceConsumer> getChildren() {
            return this.children;
        }

        public final boolean getExcluded() {
            return this.excluded;
        }

        public final String getName() {
            return this.name;
        }

        public final boolean getOverflow() {
            return this.overflow;
        }

        public final long getSize() {
            return this.size;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            long j = this.size;
            int iE = AbstractC1705Vq.e(((int) (j ^ (j >>> 32))) * 31, 31, this.name);
            boolean z = this.isDirectory;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            int iHashCode = (this.children.hashCode() + ((iE + i) * 31)) * 31;
            boolean z2 = this.overflow;
            int i2 = z2;
            if (z2 != 0) {
                i2 = 1;
            }
            int i3 = (iHashCode + i2) * 31;
            boolean z3 = this.excluded;
            return i3 + (z3 ? 1 : z3 ? 1 : 0);
        }

        public final boolean isDirectory() {
            return this.isDirectory;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("SpaceConsumer(size=");
            sb.append(this.size);
            sb.append(", name=");
            sb.append(this.name);
            sb.append(", isDirectory=");
            sb.append(this.isDirectory);
            sb.append(", children=");
            sb.append(this.children);
            sb.append(", overflow=");
            sb.append(this.overflow);
            sb.append(", excluded=");
            return F91.w(sb, this.excluded, ')');
        }

        public /* synthetic */ SpaceConsumer(long j, String str, boolean z, List list, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, str, (i & 4) != 0 ? false : z, (i & 8) != 0 ? MN.a : list, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? false : z3);
        }
    }

    private final JSONObject toJson(SpaceConsumer consumer) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("size", consumer.getSize());
        jSONObject.put("name", consumer.getName());
        if (consumer.isDirectory()) {
            jSONObject.put("is_dir", true);
        }
        if (consumer.getOverflow()) {
            jSONObject.put("is_overflow", true);
        }
        if (consumer.getExcluded()) {
            jSONObject.put("is_excluded", true);
        }
        if (!consumer.getChildren().isEmpty()) {
            JSONArray jSONArray = new JSONArray();
            List<SpaceConsumer> children = consumer.getChildren();
            ArrayList arrayList = new ArrayList(AbstractC8449zu.k(children));
            Iterator<T> it = children.iterator();
            while (it.hasNext()) {
                arrayList.add(jSONArray.put(toJson((SpaceConsumer) it.next())));
            }
            jSONObject.put("children", jSONArray);
        }
        return jSONObject;
    }
}
