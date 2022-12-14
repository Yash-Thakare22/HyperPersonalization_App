import { SUCCESS_SEARCH_BY_WORD_REQUEST, SEARCH_ERROR } from "./types";
import axios from "axios";

export const getSearchWord = ({ searchWord }) => async (dispatch) => {
    try {
        console.log({ searchWord });

        const config = {
            headers: {
                "Content-Type": "application/json",
                "app_id": "6c48a3f4",
                "app_key": "436784653c2cf1333cb02a6df38b265b"
            }
        };

        // const res = await axios.get(`https://cors-anywhere.herokuapp.com/https://od-api.oxforddictionaries.com/api/v2/entries/en-us/${searchWord}`, config);
        const res = await axios.get(
            `https://api.spoonacular.com/recipes/findByIngredients?apiKey=68dced1293014cada85c2e5c5d3d9b00&ingredients=${searchWord}&number=9`
        );
        console.log(res);
        dispatch({
            type: SUCCESS_SEARCH_BY_WORD_REQUEST,
            payload: res.data,
        });
    } catch (err) {
        dispatch({
            type: SEARCH_ERROR,
            payload: err.data,
        });
    }
}