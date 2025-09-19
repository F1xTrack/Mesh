package io.legere.pdfiumandroid;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import p000.F02;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m22266d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m22267d2 = {"Lio/legere/pdfiumandroid/FindFlags;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "MatchCase", "MatchWholeWord", "Consecutive", "pdfiumandroid_release"}, m22268k = 1, m22269mv = {2, 0, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class FindFlags {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FindFlags[] $VALUES;
    private final int value;
    public static final FindFlags MatchCase = new FindFlags("MatchCase", 0, 1);
    public static final FindFlags MatchWholeWord = new FindFlags("MatchWholeWord", 1, 2);
    public static final FindFlags Consecutive = new FindFlags("Consecutive", 2, 4);

    private static final /* synthetic */ FindFlags[] $values() {
        return new FindFlags[]{MatchCase, MatchWholeWord, Consecutive};
    }

    static {
        FindFlags[] findFlagsArr$values = $values();
        $VALUES = findFlagsArr$values;
        $ENTRIES = F02.m2482c(findFlagsArr$values);
    }

    private FindFlags(String str, int i, int i2) {
        this.value = i2;
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static FindFlags valueOf(String str) {
        return (FindFlags) Enum.valueOf(FindFlags.class, str);
    }

    public static FindFlags[] values() {
        return (FindFlags[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
