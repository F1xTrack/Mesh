package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import androidx.emoji2.text.flatbuffer.MetadataItem;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public class TypefaceEmojiRasterizer {
    static final int HAS_GLYPH_ABSENT = 1;
    static final int HAS_GLYPH_EXISTS = 2;
    static final int HAS_GLYPH_UNKNOWN = 0;
    private static final ThreadLocal<MetadataItem> sMetadataItem = new ThreadLocal<>();
    private volatile int mCache = 0;
    private final int mIndex;
    private final MetadataRepo mMetadataRepo;

    @Retention(RetentionPolicy.SOURCE)
    public @interface HasGlyph {
    }

    public TypefaceEmojiRasterizer(MetadataRepo metadataRepo, int i) {
        this.mMetadataRepo = metadataRepo;
        this.mIndex = i;
    }

    private MetadataItem getMetadataItem() {
        ThreadLocal<MetadataItem> threadLocal = sMetadataItem;
        MetadataItem metadataItem = threadLocal.get();
        if (metadataItem == null) {
            metadataItem = new MetadataItem();
            threadLocal.set(metadataItem);
        }
        this.mMetadataRepo.getMetadataList().list(metadataItem, this.mIndex);
        return metadataItem;
    }

    public void draw(Canvas canvas, float f, float f2, Paint paint) {
        Typeface typeface = this.mMetadataRepo.getTypeface();
        Typeface typeface2 = paint.getTypeface();
        paint.setTypeface(typeface);
        canvas.drawText(this.mMetadataRepo.getEmojiCharArray(), this.mIndex * 2, 2, f, f2, paint);
        paint.setTypeface(typeface2);
    }

    public int getCodepointAt(int i) {
        return getMetadataItem().codepoints(i);
    }

    public int getCodepointsLength() {
        return getMetadataItem().codepointsLength();
    }

    public short getCompatAdded() {
        return getMetadataItem().compatAdded();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public int getHasGlyph() {
        return this.mCache & 3;
    }

    public int getHeight() {
        return getMetadataItem().height();
    }

    public int getId() {
        return getMetadataItem().m10003id();
    }

    public short getSdkAdded() {
        return getMetadataItem().sdkAdded();
    }

    public Typeface getTypeface() {
        return this.mMetadataRepo.getTypeface();
    }

    public int getWidth() {
        return getMetadataItem().width();
    }

    public boolean isDefaultEmoji() {
        return getMetadataItem().emojiStyle();
    }

    public boolean isPreferredSystemRender() {
        return (this.mCache & 4) > 0;
    }

    public void resetHasGlyphCache() {
        if (isPreferredSystemRender()) {
            this.mCache = 4;
        } else {
            this.mCache = 0;
        }
    }

    public void setExclusion(boolean z) {
        int hasGlyph = getHasGlyph();
        if (z) {
            this.mCache = hasGlyph | 4;
        } else {
            this.mCache = hasGlyph;
        }
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public void setHasGlyph(boolean z) {
        int i = this.mCache & 4;
        this.mCache = z ? i | 2 : i | 1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(getId()));
        sb.append(", codepoints:");
        int codepointsLength = getCodepointsLength();
        for (int i = 0; i < codepointsLength; i++) {
            sb.append(Integer.toHexString(getCodepointAt(i)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
