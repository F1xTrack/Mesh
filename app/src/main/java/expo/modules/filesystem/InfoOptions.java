package expo.modules.filesystem;

import kotlin.Metadata;
import p000.InterfaceC1787bT;
import p000.O90;
import p000.RN0;

@Metadata(m22266d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0016\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0017\u0010\bR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0016\u0012\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001a\u0010\b¨\u0006\u001c"}, m22267d2 = {"Lexpo/modules/filesystem/InfoOptions;", "LRN0;", "", "md5", "size", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/Boolean;", "component2", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)Lexpo/modules/filesystem/InfoOptions;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "getMd5", "getMd5$annotations", "()V", "getSize", "getSize$annotations", "expo-file-system_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class InfoOptions implements RN0 {
    private final Boolean md5;
    private final Boolean size;

    public InfoOptions(Boolean bool, Boolean bool2) {
        this.md5 = bool;
        this.size = bool2;
    }

    public static /* synthetic */ InfoOptions copy$default(InfoOptions infoOptions, Boolean bool, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = infoOptions.md5;
        }
        if ((i & 2) != 0) {
            bool2 = infoOptions.size;
        }
        return infoOptions.copy(bool, bool2);
    }

    @InterfaceC1787bT
    public static /* synthetic */ void getMd5$annotations() {
    }

    @InterfaceC1787bT
    public static /* synthetic */ void getSize$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getMd5() {
        return this.md5;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getSize() {
        return this.size;
    }

    public final InfoOptions copy(Boolean md5, Boolean size) {
        return new InfoOptions(md5, size);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InfoOptions)) {
            return false;
        }
        InfoOptions infoOptions = (InfoOptions) other;
        return O90.m5963a(this.md5, infoOptions.md5) && O90.m5963a(this.size, infoOptions.size);
    }

    public final Boolean getMd5() {
        return this.md5;
    }

    public final Boolean getSize() {
        return this.size;
    }

    public int hashCode() {
        Boolean bool = this.md5;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.size;
        return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        return "InfoOptions(md5=" + this.md5 + ", size=" + this.size + ")";
    }
}
