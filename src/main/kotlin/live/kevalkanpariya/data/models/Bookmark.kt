package live.kevalkanpariya.data.models

import kotlinx.serialization.Serializable
import org.bson.codecs.pojo.annotations.BsonId
import org.bson.types.ObjectId

@Serializable
data class Bookmark(
    @BsonId
    val bookmarkId: String = ObjectId().toString(),
    val userId: String,
    val courseId: String
)
