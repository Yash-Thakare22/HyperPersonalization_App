import React, { useState } from 'react'
import { Container, Form, Button, Icon } from 'semantic-ui-react'
import axios from "axios";
import { connect } from 'react-redux';
import { getSearchWord } from "../../actions/search";
import PropTypes from "prop-types";

const SearchRecipes = ({ getSearchWord, search: { data, error } }) => {

    const [searchData, setSearchData] = useState({
        searchWord: ''
    })

    const { searchWord } = searchData;

    const onChange = e => setSearchData({ ...searchData, [e.target.name]: e.target.value });

    const onSubmit = e => {
        e.preventDefault();
        console.log(searchWord);

        getSearchWord({ searchWord });

    }

    return (
        <Container>
            <div className="formPart">
                <Form className="inputField" onSubmit={(e) => onSubmit(e)}>
                    <Form.Field width="12" className="search-section">
                        <input
                            className="searchField"
                            placeholder="Search Using Recipe Name"
                            value={searchWord}
                            name="searchWord"
                            onChange={(e) => onChange(e)}
                        />
                    </Form.Field>
                    <Button icon basic className="search-btn" color="brown">
                        <Icon name="search" /> Search
                    </Button>
                </Form>
            </div>
        </Container>
    )
}

SearchRecipes.propTypes = {
    getRecipesByIngredient: PropTypes.func.isRequired,
};

const mapStateToProps = (state) => ({
    search: state.search,
});

export default connect(mapStateToProps, { getSearchWord })(SearchRecipes);