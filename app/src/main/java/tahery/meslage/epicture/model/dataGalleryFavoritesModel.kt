package tahery.meslage.epicture.model

data class dataGalleryFavoritesModel(
    var id :String?,
    var title : String?,
    var description : String?,
    var datetime : Int,
    var cover : String?,
    var cover_width : Int,
    var cover_height : Int,
    var account_url : String?,
    var account_id :String?,
    var privacy : Boolean,
    var layout : Boolean,
    var views : Int,
    var link : String?,
    var ups : String?,
    var downs : String?,
    var points : String?,
    var score : String?,
    var is_album :Boolean,
    var vote : Int,
    var favorite : Boolean,
    var nsfw : String?,
    var section : String?,
    var comment_count : Int,
    var favorite_count : Int,
    var topic : String?,
    var topic_id : String?,
    var images_count : Int,
    var in_gallery : Boolean,
    var is_ad : Boolean,
    var tags : List<String>,
    var ad_type : Int,
    var ad_url : String?,
    var in_most_viral : Int,
    var include_album_ads : Boolean,
    var images : Array<ImageModel>
)