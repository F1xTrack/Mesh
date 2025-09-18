package io.legere.pdfiumandroid;

import android.graphics.RectF;
import android.os.ParcelFileDescriptor;
import com.huawei.hms.p015rn.push.constants.RemoteMessageAttributes;
import io.legere.pdfiumandroid.util.ConfigKt;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import p000.AbstractC7222ym;
import p000.C0779MN;
import p000.O90;

@Metadata(m22266d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 a2\u00020\u0001:\u0005bcdeaB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u00152\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0015¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\rH\u0007¢\u0006\u0004\b \u0010!J#\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00152\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\"\u0010\u0017J\u001f\u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\b\b\u0002\u0010%\u001a\u00020\u0006¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0010H\u0016¢\u0006\u0004\b)\u0010*J\u0018\u0010,\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b,\u0010-J \u0010.\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0006H\u0082 ¢\u0006\u0004\b.\u0010/J \u00100\u001a\u00020\u00102\u0006\u0010+\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0006H\u0082 ¢\u0006\u0004\b0\u00101J\u0018\u00102\u001a\u00020\u00102\u0006\u0010+\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b2\u0010\u0005J(\u00104\u001a\u0002032\u0006\u0010+\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006H\u0082 ¢\u0006\u0004\b4\u00105J \u00108\u001a\u0002062\u0006\u0010+\u001a\u00020\u00022\u0006\u00107\u001a\u000206H\u0082 ¢\u0006\u0004\b8\u00109J$\u0010;\u001a\u0004\u0018\u00010\u00022\u0006\u0010+\u001a\u00020\u00022\b\u0010:\u001a\u0004\u0018\u00010\u0002H\u0082 ¢\u0006\u0004\b;\u0010<J\"\u0010=\u001a\u0004\u0018\u00010\u00022\u0006\u0010+\u001a\u00020\u00022\u0006\u0010:\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b=\u0010>J \u0010?\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u00022\u0006\u0010:\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b?\u0010@J \u0010B\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u00022\u0006\u0010A\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\bB\u0010@J\u0018\u0010C\u001a\u0002062\u0006\u0010:\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\bC\u0010DJ(\u0010E\u001a\u00020&2\u0006\u0010+\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u0006H\u0082 ¢\u0006\u0004\bE\u0010FJ\u0018\u0010G\u001a\u00020\t2\u0006\u0010+\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\bG\u0010HJ-\u0010L\u001a\u00020\u00102\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u001b0I2\u0006\u0010:\u001a\u00020\u00022\u0006\u0010K\u001a\u00020\u0002H\u0002¢\u0006\u0004\bL\u0010MR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010N\u001a\u0004\bO\u0010PR \u0010S\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020R0Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR \u0010U\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020R0Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010TR$\u0010W\u001a\u00020&2\u0006\u0010V\u001a\u00020&8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bW\u0010YR$\u0010[\u001a\u0004\u0018\u00010Z8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`¨\u0006f"}, m22267d2 = {"Lio/legere/pdfiumandroid/PdfDocument;", "Ljava/io/Closeable;", "", "mNativeDocPtr", "<init>", "(J)V", "", "getPageCount", "()I", "", "getPageCharCounts", "()[I", "pageIndex", "Lio/legere/pdfiumandroid/PdfPage;", "openPage", "(I)Lio/legere/pdfiumandroid/PdfPage;", "LTf1;", "deletePage", "(I)V", "fromIndex", "toIndex", "", "openPages", "(II)Ljava/util/List;", "Lio/legere/pdfiumandroid/PdfDocument$Meta;", "getDocumentMeta", "()Lio/legere/pdfiumandroid/PdfDocument$Meta;", "Lio/legere/pdfiumandroid/PdfDocument$Bookmark;", "getTableOfContents", "()Ljava/util/List;", "page", "Lio/legere/pdfiumandroid/PdfTextPage;", "openTextPage", "(Lio/legere/pdfiumandroid/PdfPage;)Lio/legere/pdfiumandroid/PdfTextPage;", "openTextPages", "Lio/legere/pdfiumandroid/PdfWriteCallback;", "callback", "flags", "", "saveAsCopy", "(Lio/legere/pdfiumandroid/PdfWriteCallback;I)Z", "close", "()V", "docPtr", "nativeGetPageCount", "(J)I", "nativeLoadPage", "(JI)J", "nativeDeletePage", "(JI)V", "nativeCloseDocument", "", "nativeLoadPages", "(JII)[J", "", "tag", "nativeGetDocumentMetaText", "(JLjava/lang/String;)Ljava/lang/String;", "bookmarkPtr", "nativeGetFirstChildBookmark", "(JLjava/lang/Long;)Ljava/lang/Long;", "nativeGetSiblingBookmark", "(JJ)Ljava/lang/Long;", "nativeGetBookmarkDestIndex", "(JJ)J", "pagePtr", "nativeLoadTextPage", "nativeGetBookmarkTitle", "(J)Ljava/lang/String;", "nativeSaveAsCopy", "(JLio/legere/pdfiumandroid/PdfWriteCallback;I)Z", "nativeGetPageCharCounts", "(J)[I", "", "tree", "level", "recursiveGetBookmark", "(Ljava/util/List;JJ)V", "J", "getMNativeDocPtr", "()J", "", "Lio/legere/pdfiumandroid/PdfDocument$PageCount;", "pageMap", "Ljava/util/Map;", "textPageMap", "value", "isClosed", "Z", "()Z", "Landroid/os/ParcelFileDescriptor;", "parcelFileDescriptor", "Landroid/os/ParcelFileDescriptor;", "getParcelFileDescriptor", "()Landroid/os/ParcelFileDescriptor;", "setParcelFileDescriptor", "(Landroid/os/ParcelFileDescriptor;)V", "Companion", "Meta", "Bookmark", RemoteMessageAttributes.LINK, "PageCount", "pdfiumandroid_release"}, m22268k = 1, m22269mv = {2, 0, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class PdfDocument implements Closeable {
    public static final int FPDF_INCREMENTAL = 1;
    public static final int FPDF_NO_INCREMENTAL = 2;
    public static final int FPDF_REMOVE_SECURITY = 3;
    private boolean isClosed;
    private final long mNativeDocPtr;
    private ParcelFileDescriptor parcelFileDescriptor;
    private static final String TAG = PdfDocument.class.getName();
    private final Map<Integer, PageCount> pageMap = new LinkedHashMap();
    private final Map<Integer, PageCount> textPageMap = new LinkedHashMap();

    @Metadata(m22266d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013¨\u0006\u0017"}, m22267d2 = {"Lio/legere/pdfiumandroid/PdfDocument$Bookmark;", "", "<init>", "()V", "children", "", "getChildren", "()Ljava/util/List;", "title", "", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "pageIdx", "", "getPageIdx", "()J", "setPageIdx", "(J)V", "mNativePtr", "getMNativePtr", "setMNativePtr", "pdfiumandroid_release"}, m22268k = 1, m22269mv = {2, 0, 0}, m22271xi = 48)
    public static final class Bookmark {
        private final List<Bookmark> children = new ArrayList();
        private long mNativePtr;
        private long pageIdx;
        private String title;

        public final List<Bookmark> getChildren() {
            return this.children;
        }

        public final long getMNativePtr() {
            return this.mNativePtr;
        }

        public final long getPageIdx() {
            return this.pageIdx;
        }

        public final String getTitle() {
            return this.title;
        }

        public final void setMNativePtr(long j) {
            this.mNativePtr = j;
        }

        public final void setPageIdx(long j) {
            this.pageIdx = j;
        }

        public final void setTitle(String str) {
            this.title = str;
        }
    }

    @Metadata(m22266d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m22267d2 = {"Lio/legere/pdfiumandroid/PdfDocument$Link;", "", "bounds", "Landroid/graphics/RectF;", "destPageIdx", "", "uri", "", "<init>", "(Landroid/graphics/RectF;Ljava/lang/Integer;Ljava/lang/String;)V", "getBounds", "()Landroid/graphics/RectF;", "getDestPageIdx", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getUri", "()Ljava/lang/String;", "pdfiumandroid_release"}, m22268k = 1, m22269mv = {2, 0, 0}, m22271xi = 48)
    public static final class Link {
        private final RectF bounds;
        private final Integer destPageIdx;
        private final String uri;

        public Link(RectF rectF, Integer num, String str) {
            O90.m5968f(rectF, "bounds");
            this.bounds = rectF;
            this.destPageIdx = num;
            this.uri = str;
        }

        public final RectF getBounds() {
            return this.bounds;
        }

        public final Integer getDestPageIdx() {
            return this.destPageIdx;
        }

        public final String getUri() {
            return this.uri;
        }
    }

    @Metadata(m22266d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001a\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\tR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\t¨\u0006\u001f"}, m22267d2 = {"Lio/legere/pdfiumandroid/PdfDocument$Meta;", "", "<init>", "()V", "title", "", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "author", "getAuthor", "setAuthor", "subject", "getSubject", "setSubject", "keywords", "getKeywords", "setKeywords", "creator", "getCreator", "setCreator", "producer", "getProducer", "setProducer", "creationDate", "getCreationDate", "setCreationDate", "modDate", "getModDate", "setModDate", "pdfiumandroid_release"}, m22268k = 1, m22269mv = {2, 0, 0}, m22271xi = 48)
    public static final class Meta {
        private String author;
        private String creationDate;
        private String creator;
        private String keywords;
        private String modDate;
        private String producer;
        private String subject;
        private String title;

        public final String getAuthor() {
            return this.author;
        }

        public final String getCreationDate() {
            return this.creationDate;
        }

        public final String getCreator() {
            return this.creator;
        }

        public final String getKeywords() {
            return this.keywords;
        }

        public final String getModDate() {
            return this.modDate;
        }

        public final String getProducer() {
            return this.producer;
        }

        public final String getSubject() {
            return this.subject;
        }

        public final String getTitle() {
            return this.title;
        }

        public final void setAuthor(String str) {
            this.author = str;
        }

        public final void setCreationDate(String str) {
            this.creationDate = str;
        }

        public final void setCreator(String str) {
            this.creator = str;
        }

        public final void setKeywords(String str) {
            this.keywords = str;
        }

        public final void setModDate(String str) {
            this.modDate = str;
        }

        public final void setProducer(String str) {
            this.producer = str;
        }

        public final void setSubject(String str) {
            this.subject = str;
        }

        public final void setTitle(String str) {
            this.title = str;
        }
    }

    @Metadata(m22266d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0017"}, m22267d2 = {"Lio/legere/pdfiumandroid/PdfDocument$PageCount;", "", "pagePtr", "", "count", "", "<init>", "(JI)V", "getPagePtr", "()J", "getCount", "()I", "setCount", "(I)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "pdfiumandroid_release"}, m22268k = 1, m22269mv = {2, 0, 0}, m22271xi = 48)
    public static final /* data */ class PageCount {
        private int count;
        private final long pagePtr;

        public PageCount(long j, int i) {
            this.pagePtr = j;
            this.count = i;
        }

        public static /* synthetic */ PageCount copy$default(PageCount pageCount, long j, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                j = pageCount.pagePtr;
            }
            if ((i2 & 2) != 0) {
                i = pageCount.count;
            }
            return pageCount.copy(j, i);
        }

        /* renamed from: component1, reason: from getter */
        public final long getPagePtr() {
            return this.pagePtr;
        }

        /* renamed from: component2, reason: from getter */
        public final int getCount() {
            return this.count;
        }

        public final PageCount copy(long pagePtr, int count) {
            return new PageCount(pagePtr, count);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PageCount)) {
                return false;
            }
            PageCount pageCount = (PageCount) other;
            return this.pagePtr == pageCount.pagePtr && this.count == pageCount.count;
        }

        public final int getCount() {
            return this.count;
        }

        public final long getPagePtr() {
            return this.pagePtr;
        }

        public int hashCode() {
            long j = this.pagePtr;
            return (((int) (j ^ (j >>> 32))) * 31) + this.count;
        }

        public final void setCount(int i) {
            this.count = i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("PageCount(pagePtr=");
            sb.append(this.pagePtr);
            sb.append(", count=");
            return AbstractC7222ym.m26235l(sb, this.count, ')');
        }
    }

    public PdfDocument(long j) {
        this.mNativeDocPtr = j;
    }

    private final native void nativeCloseDocument(long docPtr);

    private final native void nativeDeletePage(long docPtr, int pageIndex);

    private final native long nativeGetBookmarkDestIndex(long docPtr, long bookmarkPtr);

    private final native String nativeGetBookmarkTitle(long bookmarkPtr);

    private final native String nativeGetDocumentMetaText(long docPtr, String tag);

    private final native Long nativeGetFirstChildBookmark(long docPtr, Long bookmarkPtr);

    private final native int[] nativeGetPageCharCounts(long docPtr);

    private final native int nativeGetPageCount(long docPtr);

    private final native Long nativeGetSiblingBookmark(long docPtr, long bookmarkPtr);

    private final native long nativeLoadPage(long docPtr, int pageIndex);

    private final native long[] nativeLoadPages(long docPtr, int fromIndex, int toIndex);

    private final native long nativeLoadTextPage(long docPtr, long pagePtr);

    private final native boolean nativeSaveAsCopy(long docPtr, PdfWriteCallback callback, int flags);

    private final void recursiveGetBookmark(List<Bookmark> tree, long bookmarkPtr, long level) {
        long j;
        if (ConfigKt.handleAlreadyClosed(this.isClosed)) {
            return;
        }
        Bookmark bookmark = new Bookmark();
        bookmark.setMNativePtr(bookmarkPtr);
        bookmark.setTitle(nativeGetBookmarkTitle(bookmarkPtr));
        bookmark.setPageIdx(nativeGetBookmarkDestIndex(this.mNativeDocPtr, bookmarkPtr));
        tree.add(bookmark);
        Long lNativeGetFirstChildBookmark = nativeGetFirstChildBookmark(this.mNativeDocPtr, Long.valueOf(bookmarkPtr));
        if (lNativeGetFirstChildBookmark == null || level >= 16) {
            j = level;
        } else {
            recursiveGetBookmark(bookmark.getChildren(), lNativeGetFirstChildBookmark.longValue(), level);
            j = level + 1;
        }
        Long lNativeGetSiblingBookmark = nativeGetSiblingBookmark(this.mNativeDocPtr, bookmarkPtr);
        if (lNativeGetSiblingBookmark == null || j >= 16) {
            return;
        }
        recursiveGetBookmark(tree, lNativeGetSiblingBookmark.longValue(), j);
    }

    public static /* synthetic */ boolean saveAsCopy$default(PdfDocument pdfDocument, PdfWriteCallback pdfWriteCallback, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 2;
        }
        return pdfDocument.saveAsCopy(pdfWriteCallback, i);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (ConfigKt.handleAlreadyClosed(this.isClosed)) {
            return;
        }
        Logger logger = Logger.INSTANCE;
        String str = TAG;
        O90.m5967e(str, "TAG");
        logger.mo21354d(str, "PdfDocument.close");
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            try {
                this.isClosed = true;
                nativeCloseDocument(this.mNativeDocPtr);
                ParcelFileDescriptor parcelFileDescriptor = this.parcelFileDescriptor;
                if (parcelFileDescriptor != null) {
                    parcelFileDescriptor.close();
                }
                this.parcelFileDescriptor = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void deletePage(int pageIndex) {
        if (ConfigKt.handleAlreadyClosed(this.isClosed)) {
            return;
        }
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            nativeDeletePage(this.mNativeDocPtr, pageIndex);
        }
    }

    public final Meta getDocumentMeta() {
        Meta meta;
        if (ConfigKt.handleAlreadyClosed(this.isClosed)) {
            return new Meta();
        }
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            meta = new Meta();
            meta.setTitle(nativeGetDocumentMetaText(this.mNativeDocPtr, "Title"));
            meta.setAuthor(nativeGetDocumentMetaText(this.mNativeDocPtr, "Author"));
            meta.setSubject(nativeGetDocumentMetaText(this.mNativeDocPtr, "Subject"));
            meta.setKeywords(nativeGetDocumentMetaText(this.mNativeDocPtr, "Keywords"));
            meta.setCreator(nativeGetDocumentMetaText(this.mNativeDocPtr, "Creator"));
            meta.setProducer(nativeGetDocumentMetaText(this.mNativeDocPtr, "Producer"));
            meta.setCreationDate(nativeGetDocumentMetaText(this.mNativeDocPtr, "CreationDate"));
            meta.setModDate(nativeGetDocumentMetaText(this.mNativeDocPtr, "ModDate"));
        }
        return meta;
    }

    public final long getMNativeDocPtr() {
        return this.mNativeDocPtr;
    }

    public final int[] getPageCharCounts() {
        int[] iArrNativeGetPageCharCounts;
        if (ConfigKt.handleAlreadyClosed(this.isClosed)) {
            return new int[0];
        }
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            iArrNativeGetPageCharCounts = nativeGetPageCharCounts(this.mNativeDocPtr);
        }
        return iArrNativeGetPageCharCounts;
    }

    public final int getPageCount() {
        int iNativeGetPageCount;
        if (ConfigKt.handleAlreadyClosed(this.isClosed)) {
            return 0;
        }
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            iNativeGetPageCount = nativeGetPageCount(this.mNativeDocPtr);
        }
        return iNativeGetPageCount;
    }

    public final ParcelFileDescriptor getParcelFileDescriptor() {
        return this.parcelFileDescriptor;
    }

    public final List<Bookmark> getTableOfContents() {
        ArrayList arrayList;
        if (ConfigKt.handleAlreadyClosed(this.isClosed)) {
            return C0779MN.f7117a;
        }
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            arrayList = new ArrayList();
            Long lNativeGetFirstChildBookmark = nativeGetFirstChildBookmark(this.mNativeDocPtr, null);
            if (lNativeGetFirstChildBookmark != null) {
                recursiveGetBookmark(arrayList, lNativeGetFirstChildBookmark.longValue(), 1L);
            }
        }
        return arrayList;
    }

    /* renamed from: isClosed, reason: from getter */
    public final boolean getIsClosed() {
        return this.isClosed;
    }

    public final PdfPage openPage(int pageIndex) {
        PageCount pageCount;
        if (this.isClosed) {
            throw new IllegalStateException("Already closed");
        }
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            if (this.pageMap.containsKey(Integer.valueOf(pageIndex)) && (pageCount = this.pageMap.get(Integer.valueOf(pageIndex))) != null) {
                pageCount.setCount(pageCount.getCount() + 1);
                return new PdfPage(this, pageIndex, pageCount.getPagePtr(), this.pageMap);
            }
            long jNativeLoadPage = nativeLoadPage(this.mNativeDocPtr, pageIndex);
            this.pageMap.put(Integer.valueOf(pageIndex), new PageCount(jNativeLoadPage, 1));
            return new PdfPage(this, pageIndex, jNativeLoadPage, this.pageMap);
        }
    }

    public final List<PdfPage> openPages(int fromIndex, int toIndex) {
        ArrayList arrayList;
        if (ConfigKt.handleAlreadyClosed(this.isClosed)) {
            return C0779MN.f7117a;
        }
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            try {
                long[] jArrNativeLoadPages = nativeLoadPages(this.mNativeDocPtr, fromIndex, toIndex);
                for (long j : jArrNativeLoadPages) {
                    if (fromIndex > toIndex) {
                        break;
                    }
                    fromIndex++;
                }
                arrayList = new ArrayList(jArrNativeLoadPages.length);
                for (long j2 : jArrNativeLoadPages) {
                    arrayList.add(new PdfPage(this, fromIndex, j2, this.pageMap));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    public final PdfTextPage openTextPage(PdfPage page) {
        PageCount pageCount;
        O90.m5968f(page, "page");
        if (this.isClosed) {
            throw new IllegalStateException("Already closed");
        }
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            if (this.textPageMap.containsKey(Integer.valueOf(page.getPageIndex())) && (pageCount = this.textPageMap.get(Integer.valueOf(page.getPageIndex()))) != null) {
                pageCount.setCount(pageCount.getCount() + 1);
                return new PdfTextPage(this, page.getPageIndex(), pageCount.getPagePtr(), this.textPageMap);
            }
            long jNativeLoadTextPage = nativeLoadTextPage(this.mNativeDocPtr, page.getPagePtr());
            this.textPageMap.put(Integer.valueOf(page.getPageIndex()), new PageCount(jNativeLoadTextPage, 1));
            return new PdfTextPage(this, page.getPageIndex(), jNativeLoadTextPage, this.textPageMap);
        }
    }

    public final List<PdfTextPage> openTextPages(int fromIndex, int toIndex) {
        ArrayList arrayList;
        if (ConfigKt.handleAlreadyClosed(this.isClosed)) {
            return C0779MN.f7117a;
        }
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            long[] jArrNativeLoadPages = nativeLoadPages(this.mNativeDocPtr, fromIndex, toIndex);
            arrayList = new ArrayList(jArrNativeLoadPages.length);
            int length = jArrNativeLoadPages.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                int i3 = i2 + 1;
                arrayList.add(new PdfTextPage(this, fromIndex + i2, jArrNativeLoadPages[i], this.textPageMap));
                i++;
                i2 = i3;
            }
        }
        return arrayList;
    }

    public final boolean saveAsCopy(PdfWriteCallback callback, int flags) {
        O90.m5968f(callback, "callback");
        if (ConfigKt.handleAlreadyClosed(this.isClosed)) {
            return false;
        }
        return nativeSaveAsCopy(this.mNativeDocPtr, callback, flags);
    }

    public final void setParcelFileDescriptor(ParcelFileDescriptor parcelFileDescriptor) {
        this.parcelFileDescriptor = parcelFileDescriptor;
    }
}
